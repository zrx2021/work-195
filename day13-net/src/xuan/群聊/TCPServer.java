package xuan.群聊;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TCPServer {
    public static List<Socket> sockets = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        System.out.println("TCP服务端 启动啦！");
        // 1.创建TCP服务端，绑定本机的10086端口
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket socket;

        while (true) {
            // 2.同意客户端的链接，没有客户端连接会一直等待（阻塞式方法）
            socket = serverSocket.accept();
            // 把连接的Socket加入到集合中
            sockets.add(socket);

            // 同意之后，使用新线程来读取数据
            ServerReadThread srt = new ServerReadThread(socket);
            srt.start();
        }
    }
}
