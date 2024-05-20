package xuan.demo10字节缓冲流;

import java.io.*;

/*
目标:学习字节缓冲流
    字节缓冲输入流
    字节缓冲输出流
 */
public class Demo10 {
    public static void main(String[] args) throws IOException {
        // 创建字节缓冲输入流
        // BufferedInputStream(InputStream in): 对参数的流进行包装加强, 内部自带8192大小的数组, 真正操作文件靠参数的流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day09-io\\text\\1.txt"));

        // 创建字节缓冲输出流
        // BufferedOutputStream(OutputStream out): 对参数的流进行包装加强, 内部自带8192大小的数组, 真正操作文件靠参数的流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day09-io\\text\\11.txt"));

        // 读写数据
        byte[] buf = new byte[1024];
        int len;
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
        }

        bis.close();// 自动关闭参数的流
        bos.close();// 自动关闭参数的流
    }
}
