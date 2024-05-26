package xuan.demo02UDP循环收发;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

// UDP接收端
public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        System.out.println("UDP接收端启动啦");
        // 1.创建接收端      绑定本机的9527端口
        DatagramSocket socket = new DatagramSocket(9527);

        // 2.创建空的数据包
        // DatagramPacket(byte[] buf, int length)
        // byte[] buf：保存数组的数据
        // int length：数组能保存的数据
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        while (true) {
            // 3.接收数据       没有数据会一直等待(阻塞式方法)
            socket.receive(packet);
            // 接收的长度
            int length = packet.getLength();
            // 把数组转成字符串
            String message = new String(buf, 0, length);
            System.out.println("接收到的数据：" + message);
        }
    }
}
