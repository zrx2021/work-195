package xuan.homework5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        DataOutputStream outData = new DataOutputStream(socket.getOutputStream());
        DataInputStream inData = new DataInputStream(socket.getInputStream());
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你的账号:");
            String userName = sc.next();
            System.out.println("请输入你的密码:");
            String password = sc.next();

            outData.writeUTF(userName);
            outData.writeUTF(password);

            String result = inData.readUTF();
            System.out.println("客户端收到结果: " + result);

            if (result.equals("登录成功")) {
                break;
            }
        }

        inData.close();
        outData.close();
        socket.close();
    }
}
