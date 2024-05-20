package xuan.demo1编码和解码操作;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
    目标: 学习 字符的编码和解码

    [97,            -26,        -120,       -111,       109]
    01100001    11100110    10001000    10010001    01101101



    [97,            -50,      -46,        109]
    01100001    11001110    11010010    01101101
 */
public class Demo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name = "a我m";

        // 1.使用默认的字符集 把字符串 编码为 字节数组 IDEA默认是UTF-8
        byte[] bytes = name.getBytes();

        // 2.使用指定的 GBK字符集 把字符串 编码为 字节数组
        byte[] gbks = name.getBytes("GBK");

        // 3.使用默认的字符集 把字节数组 解码为 字符串
        String s = new String(bytes);
        System.out.println("使用默认的字符集编码 = " + s);

        // 4.使用指定的GBK的字符集 把字节数组 解码为 字符串
        String gbk = new String(gbks, "GBK");
        System.out.println("使用指定的GBK的字符集解码 = " + gbk);

        // 5.乱码现象 把 UTF-8 编码的 字节数组 使用 GBK 解码
        String luanString = new String(bytes, "GBK");
        System.out.println(luanString);
    }
}
