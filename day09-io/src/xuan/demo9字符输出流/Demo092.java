package xuan.demo9字符输出流;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
目标:学习字符流close和flush方法的区别

    flush: 刷新缓冲区, 刷新后还能再写
    close: 关闭流, 关闭后不能再写 (一定要close)
 */
public class Demo092 {
    public static void main(String[] args) throws IOException {
        // 字节流: 写数据时,字节数据会直接写到文件中, 文件中本质就是字节数据
        // FileOutputStream fos = new FileOutputStream("day09-io\\abc\\6.txt");
        // fos.write(97);
        // 字节流写的是字节数据, 文件底层也是保存字节数据, 字节流不close, 写的数据会直接到文件

        // 字符流: 写数据时,字符数据不会直接写到文件中, 文件中本质就是字节数据
        FileWriter fw = new FileWriter("day09-io\\abc\\7.txt");
        fw.write("你好呀,记住我了吗?");
        // 字符流写的是字符数据, 文件底层是保存字节数据, 字符流不close, 写的字符数据不会直接到文件
        // fw.flush(); // 刷新 字符流的缓冲区, 让文字保存到文件中(类似文件的保存), flush后还可以再写
        fw.close(); // 关闭流, 在关闭之前会自动flush刷新一下,(类似文件的退出) close不能再写
        // fw.write("呵呵");
    }
}