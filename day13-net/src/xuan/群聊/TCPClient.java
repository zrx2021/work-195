package xuan.群聊;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        System.out.println("TCP客户端 启动啦！");
        // 1.创建客户端，客户端自动连接本机的10086端口
        Socket socket = new Socket("127.0.0.1", 10086);

        // 专门创建一个线程负责读取数据
        Thread read = new Thread(new Runnable() { // 新的线程执行读取的代码
            @Override
            public void run() {
                try {
                    InputStream in = socket.getInputStream();
                    DataInputStream dis = new DataInputStream(in);
                    while (true) {
                        String msg = dis.readUTF();
                        System.out.println("收到群发：" + msg);
                    }
                } catch (IOException e) {
                    System.out.println("抛出异常" + e);
                }
            }
        });
        read.start();

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

            if (msg.equals("end")) {
                break;
            }
        }

        // 3.关闭
        dos.close();
        socket.close();
    }
}
