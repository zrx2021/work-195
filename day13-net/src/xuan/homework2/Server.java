package xuan.homework2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();

            InputStream in = socket.getInputStream();
            DataInputStream inData = new DataInputStream(in);

            String str = inData.readUTF();
            System.out.println("str = " + str);

            OutputStream out = socket.getOutputStream();
            DataOutputStream outData = new DataOutputStream(out);
            outData.writeUTF("你好");

            inData.close();
            outData.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
