package DateServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class DateClient {

    static int port = 8080;
    static String host = "192.168.43.245";
    static DataInputStream in;
    static DataOutputStream out;
    static Socket socket;


        public static void main(String[] args) throws IOException {

            var socket = new Socket(host, port);
            var in = new Scanner(socket.getInputStream());
            System.out.println("Server response: " + in.nextLine());
        }


}
