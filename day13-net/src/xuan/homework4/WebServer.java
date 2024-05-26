package xuan.homework4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10010);

            while (true) {
                FileInputStream fis = new FileInputStream("day13-net\\src\\xuan\\homework4\\hello.html");
                Socket socket = serverSocket.accept();
                OutputStream out = socket.getOutputStream();
                out.write("HTTP/1.1 200 OK\r\n".getBytes()); // 告诉浏览器服务器是正常的
                out.write("Content-Type:text/html;charset=utf-8\r\n".getBytes()); // 告诉浏览器服务器返回的是一个HTML网页,编码是UTF-8
                out.write("\r\n".getBytes());

                byte[] bytes = new byte[1024 * 8];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    out.write(bytes, 0, len);
                }
                out.close();
                fis.close();
            }
        } catch (IOException e) {
            System.out.println("抛出IO异常" + e);
            e.printStackTrace();
        }
    }
}
