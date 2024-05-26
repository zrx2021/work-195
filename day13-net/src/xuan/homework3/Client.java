package xuan.homework3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

            OutputStream out = socket.getOutputStream();
            DataOutputStream outData = new DataOutputStream(out);
            outData.writeUTF("hello,服务器,我是客户端");

            InputStream in = socket.getInputStream();
            DataInputStream inData = new DataInputStream(in);
            String str = inData.readUTF();
            System.out.println("str = " + str);

            in.close();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
