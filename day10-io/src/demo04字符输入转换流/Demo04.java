package demo04字符输入转换流;

import java.io.*;

/*
目标: 学习字符输入转换流指定字符集读取数据
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        // 使用转换流读取 GBK文件的字符
        //  InputStreamReader(InputStream in, String charsetName): 使用参数指定的字节流读取文件的字节数据, 使用第二个参数指定的字符集把字节转成文字
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10-io\\abc\\china_gbk.txt")); // 默认是UTF-8
        // InputStreamReader isr = new InputStreamReader(new FileInputStream("day10-io\\abc\\china_gbk.txt"), "GBK");

        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.println((char) ch);
        }

        isr.close();
    }
}
