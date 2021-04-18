/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Apr-21
 *   Time: 8:06 PM
 *   File: Server.java
 */

package SingleClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket socket = new ServerSocket(4000);
        System.out.println("Waiting for client connection");
        Socket clientSocket = socket.accept();
        System.out.println("Client connected");
    }
}

