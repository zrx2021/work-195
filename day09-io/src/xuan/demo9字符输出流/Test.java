package xuan.demo9字符输出流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
使用键盘输入一个字符串
使用键盘输入源文件名
使用键盘输入目的地文件名

把键盘输入的字符串保存到源文件中
再把源文件的内容复制到目的地文件中
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // 使用键盘输入一个字符串
        System.out.println("请输入一个字符串: ");
        String content = sc.next();

        // 使用键盘输入源文件名
        System.out.println("请输入源文件名: ");
        String sourceName = sc.next();

        // 使用键盘输入目的地文件名
        System.out.println("请输入目的地文件名: ");
        String targetName = sc.next();

        // 把键盘输入的字符串保存到源文件中 (使用文件字符输出流)
        FileWriter fw = new FileWriter(sourceName);
        fw.write(content);
        fw.close();

        // 字符流只能复制文本文件,不能复制视频,音频图片
        // 再把源文件的内容复制到目的地文件中 (因为是纯文本使用字符流复制也可以, 推荐看到复制就使用字节流, 文件复制)
        FileInputStream fis = new FileInputStream(sourceName);
        FileOutputStream fos = new FileOutputStream(targetName);

        // 循环读写
        byte[] buf = new byte[1024 * 8]; // 保存读取的字节数据
        int len; // 保存读取的数量
        while ((len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
    }
}
