package xuan.demo04字节流读取多个字节;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        // 1.创建文件字节输入流
        // FileInputStream fis = new FileInputStream("day09-io\\abc\\3.txt");
        //
        // byte[] buf = new byte[3]; // {0, 0, 0}

        // 文件中的数据:      abcdefg
        //                第一次           第二次          第三次
        // 数组的内容:    {a, b, c}      {d, e, f}      {g, e, f}

        // 2.读取多个字节
        // public int read(byte b[]): 读取多个字节保存到参数数组中, 返回读取的数量, 如果没有数据返回-1
        // int len = fis.read(buf);
        // System.out.println("读取的数量: " + len); // 3
        // System.out.println("读取的内容: " + new String(buf)); // abc
        //
        // len = fis.read(buf);
        // System.out.println("读取的数量: " + len); // 3
        // System.out.println("读取的内容: " + new String(buf)); // def
        //
        // len = fis.read(buf);
        // System.out.println("读取的数量: " + len); // 1
        // System.out.println("读取的内容: " + new String(buf)); // gef
        //
        // len = fis.read(buf);
        // System.out.println("读取的数量: " + len); // -1
        // System.out.println("读取的内容: " + new String(buf)); // gef

        FileInputStream fis = new FileInputStream("day09-io\\abc\\3.txt");

        // 准备两个变量
        byte[] buf = new byte[3]; // 保存读取的内容, 一般真实开发中数组长度写 1024 * 8
        int len; // 保存读取的数量
        // 1.fis.read(buf): 读取多个字节保存到buf数组中
        // 2.len = fis.read(buf): 把读取的数量赋值给len
        // 3.len != -1: 判断读取的数量len != -1
        while ((len = fis.read(buf)) != -1) {
            System.out.println("读取的内容: " + new String(buf, 0, len));
        }

        // 3.关闭流
        fis.close();
    }
}
