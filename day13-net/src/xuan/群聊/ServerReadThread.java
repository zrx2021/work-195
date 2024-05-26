package xuan.群聊;

import java.io.*;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;

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

                // 遍历所有在线的Socket，依次发送
                for (Socket online : TCPServer.sockets) {
                    // if (online == socket) {
                    //     continue;
                    // }

                    // 拿到在线的Socket的输出流，发送数据给客户端
                    OutputStream out = online.getOutputStream();
                    DataOutputStream dos = new DataOutputStream(out);
                    dos.writeUTF(msg);
                }

                if (msg.equals("end")) {
                    break;
                }
            }

            // 4.关闭
            socket.close();
        } catch (IOException e) {
            System.out.println("服务器读取失败：" + e);
        }
    }
}
