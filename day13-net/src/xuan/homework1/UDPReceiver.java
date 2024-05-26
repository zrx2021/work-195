package xuan.homework1;

import java.io.IOException;
import java.net.*;

public class UDPReceiver {
    public static void main(String[] args) {
        try {
            DatagramSocket UDP = new DatagramSocket(12580);

            // UDP报文最大字节数：64KB
            byte[] bytes = new byte[1024 * 64];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            UDP.receive(packet);

            int length = packet.getLength();
            String str = new String(bytes, 0, length);
            System.out.println("str = " + str);

            UDP.close();
        } catch (SocketException e) {
            System.out.println("套接字异常");
        } catch (UnknownHostException e) {
            System.out.println("未知主机异常");
        } catch (IOException e) {
            System.out.println("IO异常");
        }
    }
}
