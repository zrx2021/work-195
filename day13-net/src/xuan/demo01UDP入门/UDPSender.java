package xuan.demo01UDP入门;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// UDP发送端
public class UDPSender {
    public static void main(String[] args) throws IOException {
        System.out.println("UDP发送端启动啦");
        // 1.创建发送端，     随机分配一个端口
        DatagramSocket socket = new DatagramSocket();

        // 2.创建数据包
        // DatagramPacket(byte[] buf, int offset, int length, InetAddress address, int port)
        // byte[] buf：要发送的数据，字节数组
        // int offset：从数组哪个位置开始发
        // int length：发送的长度
        // InetAddress：接收方的IP   InetAddress.getLocalHost()：本机的IP, InetAddress.getByName("192.168.109.41")：指定IP
        // int port：接收方端口号
        byte[] bytes = "你好，约吗?UDP".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getLocalHost(), 9527);

        // 3.发送数据包
        socket.send(packet);

        // 4.关闭
        socket.close();
    }
}
