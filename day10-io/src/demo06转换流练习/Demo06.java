package demo06转换流练习;

import java.io.*;

/*
目标: 把UTF-8编码的文件内容转成GBK编码的文件
 */
public class Demo06 {
    public static void main(String[] args) throws IOException {
        // 1.指定UTF-8读取文件
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10-io\\abc\\message_utf8.txt"));
        // 2.指定GBK写文件
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10-io\\abc\\message_gbk.txt"), "gbk");

        // 3.循环读写
        char[] buf = new char[1024];
        int len;
        while ((len = isr.read(buf)) != -1) {
            osw.write(buf, 0, len);
        }

        // 4.关闭流
        osw.close();
        isr.close();
    }
}
