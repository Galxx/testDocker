package Server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        try {
            ServerSocket server = new ServerSocket(45000);
            DataOutputStream os ;
            System.out.println("Server started on 45000");
            while (true) {
                Socket socket = server.accept();
                os = new DataOutputStream(socket.getOutputStream());
                count++;
                os.writeUTF("Privet client №"+ count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
