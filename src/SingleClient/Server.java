/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Apr-21
 *   Time: 8:06 PM
 *   File: Server.java
 */

package SingleClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket socket = new ServerSocket(4000);
        System.out.println("Waiting for client connection");
        Socket clientSocket = socket.accept();
        System.out.println("Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
        String msg;

        do{
            msg=in.readLine();
            System.out.println("Client send :- "+msg);
            out.println("Server acknowledge this message :- "+msg);
        }while(!msg.equals("exist"));
    }
}

