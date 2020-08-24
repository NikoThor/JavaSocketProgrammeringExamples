package DateServer;

import java.io.IOException;
import java.net.ServerSocket;

public class DateServer {
    public static void main(String[] args) throws IOException {
        try(var listener = new ServerSocket(8080)) {
            System.out.println("The Date Server is running....");

            while(true) {

            }
        }

    }
}
