package demo03字符流读字符乱码问题;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
目标:学习字符流读不同编码的文件乱码问题

讲解:
    中文在GBK编码中占2个字节
    中文在UTF-8编码中占3个字节

    1.为什么会乱码?
        保存和读取使用了不同的编码

    2.如何解决乱码?
        保证读取时的编码和保存的编码是相同的就可以
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        // 代码是UTF-8编码, 文件也是UTF-8编码 (正常)
        // FileReader fr = new FileReader("day10-io\\abc\\china_utf8.txt");

        // 代码是UTF-8编码, 文件是GBK编码 (乱码)
        FileReader fr = new FileReader("day10-io\\abc\\china_gbk.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }

        fr.close();
    }
}