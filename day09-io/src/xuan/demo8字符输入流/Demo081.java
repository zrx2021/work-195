package xuan.demo8字符输入流;

import java.io.FileInputStream;
import java.io.IOException;

/*
目标:演示字节流读取字符数据有问题
 */
public class Demo081 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day09-io\\abc\\4.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }

        fis.close();
    }
}
