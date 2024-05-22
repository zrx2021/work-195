package demo05字符输出转换流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
目标: 使用字符输出转换流写数据到文件
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        // 创建字符输出转换流
        // OutputStreamWriter(OutputStream out): 使用默认的字符把字符数据转成字节数据写到文件
        // OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10-io\\abc\\hello_utf8.txt"));

        // OutputStreamWriter(OutputStream out, String charsetName): 使用指定的字符把字符数据转成字节数据写到文件
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10-io\\abc\\hello_gbk.txt"), "gbk");

        // 写字符数据
        osw.write("你好");

        // 关闭流
        osw.close();
    }
}
