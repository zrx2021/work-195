package xuan.demo06文件复制;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
计算机中所有的文件都是以字节形式存储的.字节流可以复制任意类型的文件, 以后需要复制文件就使用字节流
 */
public class Demo06 {
    public static void main(String[] args) throws IOException {
        // 1.创建文件字节输入流
        FileInputStream fis = new FileInputStream("D:\\MyFileTest\\中国梦.txt");

        // 2.创建文件字节输出流
        FileOutputStream fos = new FileOutputStream("D:\\MyFileTest\\中国梦2.txt");

        // 3.循环读写
        byte[] buf = new byte[1024 * 8]; // 保存读取的字节数据
        int len; // 保存读取的长度

        while ((len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }

        // 3.一次读完所有内容, 一次写到目的地
        // byte[] allBytes = fis.readAllBytes();
        // fos.write(allBytes);

        // 4.关闭流
        fos.close();
        fis.close();
    }
}
