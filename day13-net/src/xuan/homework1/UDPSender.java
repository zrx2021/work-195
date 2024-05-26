package xuan.homework1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) {
        try {
            DatagramSocket UDP = new DatagramSocket();

            byte[] bytes = "测试字符串123abc!@#".getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getLocalHost(), 12580);
            UDP.send(packet);
        } catch (IOException e) {
            System.out.println("IO异常" + e);
        }
    }
}
