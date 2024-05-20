package xuan.demo05字节流读取全部字节;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
目标: 字节流一次读取全部字节

一次读取所有字节,文件不能太大, 不然花费太多内容
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        // 1.创建文件字节输入流
        FileInputStream fis = new FileInputStream("day09-io\\abc\\3.txt");

        // 2.读取所有字节
        byte[] allBytes = fis.readAllBytes();
        System.out.println(Arrays.toString(allBytes));

        // 3.关闭流
        fis.close();
    }
}
