package xuan.demo05TCP多个客户端;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器允许多人连接:
        while (true) {
            Socket socket = serverSocket.accept();
            ...
        }

    服务器允许多人"同时"连接:
        同意之后, 使用新线程来读取数据

         while (true) {
            // 2.同意客户端的链接, 没有客户端连接会一直等待(阻塞式方法)
            Socket socket = serverSocket.accept();

            // 同意之后, 使用新线程来读取数据
            ServerReadThread srt = new ServerReadThread(socket);
            srt.start();
        }
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("TCP客户端 启动啦！");
        // 1.创建TCP服务端，绑定本机的10086端口
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket socket;

        while (true) {
            // 2.同意客户端的链接，没有客户端连接会一直等待（阻塞式方法）
            socket = serverSocket.accept();

            // 同意之后, 使用新线程来读取数据
            ServerReadThread srt = new ServerReadThread(socket);
            srt.start();
        }
    }
}
