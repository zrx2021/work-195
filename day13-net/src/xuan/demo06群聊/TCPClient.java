package xuan.demo06群聊;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

// TCP客户端, 不能先启动客户端, 没有服务端连接会报错!
public class TCPClient {
    public static void main(String[] args) throws IOException {
        System.out.println("TCP客户端 启动啦!");
        // 1.创建客户端, 客户端自动连接 本机的 10086端口
        Socket socket = new Socket("127.0.0.1", 10086);

        // 专门创建一个线程负责读取数据
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() { // 新的线程执行读取的代码
                try {
                    InputStream in = socket.getInputStream();
                    DataInputStream dis = new DataInputStream(in);

                    while (true) {
                        String msg = dis.readUTF();
                        System.out.println("客户端收到: " + msg);
                    }
                } catch (IOException e) {
                    System.out.println("客户端读取数据失败: " + e);
                }
            }
        });
        t.start();

        // 2.得到输出流, 写数据
        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);

        Scanner sc = new Scanner(System.in);

        // 循环发送
        while (true) {
            System.out.println("请输入要发送的数据: ");
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
