/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Apr-21
 *   Time: 3:59 PM
 *   File: MultiThreadedServer.java
 */

package MultipleClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(4000);
        System.out.println("Waiting for connection");
        while(true){
            Socket client = socket.accept();
            System.out.println("Client connected");

            Messaging obj = new Messaging(client);
            obj.start();
        }
    }
}

