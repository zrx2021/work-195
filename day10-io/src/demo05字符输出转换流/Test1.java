package demo05字符输出转换流;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        // FileReader fr = new FileReader("day10-io\\abc\\message_utf8.txt");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10-io\\abc\\message_utf8.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10-io\\abc\\message_gbk.txt"), "GBK");

        int ch;
        while ((ch = isr.read()) != -1) {
            osw.write((char) ch);
        }

        isr.close();
        osw.close();
    }
}
