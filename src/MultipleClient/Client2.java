/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Apr-21
 *   Time: 4:10 PM
 *   File: Client2.java
 */

package MultipleClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

    public static void main(String[] args) throws IOException {
        Socket socket= new Socket("localhost",4000);
        System.out.println("Connected to the server");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

        Scanner sc = new Scanner(System.in);
        String msg;
        do{
            msg=sc.nextLine();
            out.println(msg);
            String response = in.readLine();
            System.out.println(response);
        }while(!msg.equals("exist"));
    }
}




