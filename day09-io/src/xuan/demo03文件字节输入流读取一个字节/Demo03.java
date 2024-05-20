package xuan.demo03文件字节输入流读取一个字节;

import java.io.FileInputStream;
import java.io.IOException;

/*
目标: 文件字节输入流读取文件中的字节数据, 字节输入流读取一个字节
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        // 1.创建文件字节输入流
        // FileInputStream fis = new FileInputStream(""day09-io/text/2.txt"");

        // 2.调用方法读取一个字节数据
        // public int read(): 读取一个字节数据, 返回值就是读取的字节数据, 没有数据返回-1 (效率低)
        // int b = fis.read();
        // System.out.println("b = " + b); // 97
        //
        // // 给变量赋值
        // b = fis.read();
        // System.out.println("b = " + b); // 98
        //
        // b = fis.read();
        // System.out.println("b = " + b); // 99
        //
        // b = fis.read();
        // System.out.println("b = " + b); // 没有内容, 返回-1

        // 使用循环解决
        FileInputStream fis = new FileInputStream("day09-io\\abc\\2.txt");

        int b; // 保存每次读取的字节数据
        // 1.fis.read(): 从文件读取一个字节
        // 2.b = fis.read(): 把读取的字节数据赋值给变量b
        // 3.b!= -1: 判断b != -1
        while ((b = fis.read()) != -1) {
            System.out.println("b = " + b);
        }

        // 3.关闭流
        fis.close();
    }
}
