package xuan.demo05TCP多个客户端;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

// TCP客户端, 不能先启动客户端, 没有服务端连接会报错!
public class TCPClient {
    public static void main(String[] args) throws IOException {
        System.out.println("TCP客户端 启动啦！");
        // 1.创建客户端，客户端自动连接本机的10086端口
        Socket socket = new Socket("127.0.0.1", 10086);

        // 2.得到输出流，写数据
        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);

        Scanner sc = new Scanner(System.in);

        // 循环发送
        while (true) {
            System.out.println("请输入你要发送的内容：");
            String msg = sc.next();

            // 发送数据
            dos.writeUTF(msg);

            // 如果输入的是 "end" 结束
            if (msg.equals("end")) {
                break;
            }
        }

        // 3.关闭
        dos.close();
        socket.close();
    }
}
