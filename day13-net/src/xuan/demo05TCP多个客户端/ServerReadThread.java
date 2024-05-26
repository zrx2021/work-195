package xuan.demo05TCP多个客户端;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.SocketAddress;

// 服务端读取数据的线程
public class ServerReadThread extends Thread {
    private Socket socket;

    public ServerReadThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 使用新线程来读取数据
            SocketAddress address = socket.getRemoteSocketAddress();
            System.out.println("有人连接啦：" + address);

            // 3.得到输入流，读取数据
            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            // 循环接收
            while (true) {
                String msg = dis.readUTF();
                System.out.println("服务端收到：（" + address + "）发送的：" + msg);

                if (msg.equals("end")) {
                    break;
                }
            }

            // 4.关闭
            dis.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("服务器读取失败：" + e);
        }
    }
}
