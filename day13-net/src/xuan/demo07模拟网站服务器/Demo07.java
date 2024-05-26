package xuan.demo07模拟网站服务器;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
目标: 模拟网站服务器

BS架构: 浏览器/服务器 模式
    浏览器本质上是TCP的客户端(现成的)
    服务器本质上是TCP的服务端(我们要编写的)
 */
public class Demo07 {
    public static void main(String[] args) throws IOException {
        System.out.println("京东服务器启动啦！");
        // 创建TCP服务器，绑定本机的9520端口
        ServerSocket serverSocket = new ServerSocket(9520);

        // 创建好线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                20,
                200,
                100,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(200),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy()
        );

        while (true) {
            // 同意客户端连接
            Socket socket = serverSocket.accept();

            // 每当有客户端连接啦，就提交任务到线程池，线程池派线程执行任务，给浏览器发送数据
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        // 使用新的线程发送数据给浏览器
                        System.out.println(socket.getRemoteSocketAddress() + "连接了，发送数据！");

                        // 获取输出流，返回数据给浏览器（TCP客户端）
                        OutputStream out = socket.getOutputStream();
                        // 给浏览器发送数据，按照HTTP协议返回
                        // HTTP是对TCP协议做了封装，有固定的回复格式
                        out.write("HTTP/1.1 200 OK\r\n".getBytes()); // 告诉浏览器服务器是正常的
                        out.write("Content-Type:text/html;charset=utf-8\r\n".getBytes()); // 告诉浏览器服务器返回的是一个HTML网页,编码是UTF-8
                        out.write("\r\n".getBytes());
                        out.write("是兄弟就不要迟到!".getBytes());
                    } catch (IOException e) {
                        System.out.println("给浏览器发送数据失败：" + e);
                    }
                }
            });
        }
    }
}
