import java.io.*;
import java.net.*;

public class TCPChat {

    public static void main(String[] args) {

        try {
            // Server
            ServerSocket server = new ServerSocket(5000);

            // Client
            Socket client = new Socket("localhost", 5000);

            Socket socket = server.accept();

            PrintWriter out = new PrintWriter(
                    client.getOutputStream(), true);

            out.println("Hello Server");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            System.out.println("Message Received: " + in.readLine());

            client.close();
            socket.close();
            server.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}