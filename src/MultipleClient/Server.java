/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Apr-21
 *   Time: 3:45 PM
 *   File: Server.java
 */

package MultipleClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(4000);
        System.out.println("Waiting for connection");
        Socket client = socket.accept();
        System.out.println("Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(),true);

    }
}

