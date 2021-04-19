/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Apr-21
 *   Time: 4:01 PM
 *   File: Messaging.java
 */

package MultipleClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Messaging extends Thread {

    Socket clientSocket;

    public Messaging(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String msg = null;
            do {
                msg = in.readLine();
                System.out.println("Cliend sent :- " + msg);
                out.println("Server acknowledge this message :- " + msg);
            }
            while (!msg.equals("exist"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

