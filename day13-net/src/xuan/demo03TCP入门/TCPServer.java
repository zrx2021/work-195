package xuan.demo03TCP入门;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// TCP服务端
public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("TCP客户端 启动啦！");
        // 1.创建TCP服务端，绑定本机的10086端口
        ServerSocket serverSocket = new ServerSocket(10086);

        // 2.同意客户端的链接，没有客户端连接会一直等待（阻塞式方法）
        Socket socket = serverSocket.accept();

        // 3.得到输入流，读取数据
        InputStream in = socket.getInputStream();
        DataInputStream dis = new DataInputStream(in);
        String msg = dis.readUTF();
        System.out.println("服务端接收到：" + msg);

        // 4.关闭
        dis.close();
        socket.close();
        serverSocket.close();
    }
}
