package xuan.homework5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class ShoppingServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Properties properties = new Properties();
        FileReader reader = new FileReader("day13-net\\src\\xuan\\homework5\\user.properties");
        properties.load(reader);
        reader.close();

        while (true) {
            Socket socket = serverSocket.accept();
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String userName = dis.readUTF().trim();
                String password = dis.readUTF().trim();

                String pwd = properties.getProperty(userName);
                // 6.返回登录的结果
                if (password.equals(pwd)) {
                    dos.writeUTF("登录成功");
                    break;
                } else {
                    dos.writeUTF("登录失败");
                }
            }

            dos.close();
            dis.close();
            socket.close();
        }
    }
}
