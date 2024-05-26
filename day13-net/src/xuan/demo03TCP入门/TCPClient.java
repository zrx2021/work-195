package xuan.demo03TCP入门;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

// TCP客户端, 不能先启动客户端, 没有服务端连接会报错!
public class TCPClient {
    public static void main(String[] args) throws IOException {
        System.out.println("TCP客户端 启动啦！");
        // 1.创建客户端，客户端自动连接本机的10086端口
        Socket socket = new Socket("127.0.0.1", 10086);

        // 2.得到输出流，写数据
        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);
        dos.writeUTF("你好，约吗？TCP");

        // 3.关闭
        dos.close();
        socket.close();
    }
}
