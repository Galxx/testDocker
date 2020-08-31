package client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try {
            Socket  socket = new Socket("18.224.4.87", 45000);
            DataInputStream is = new DataInputStream(socket.getInputStream());
            String message = is.readUTF();
            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
