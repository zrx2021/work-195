package demo01字符缓冲流;

import java.io.*;

/*
目标: 学习字符缓冲流
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        test01();
        test02();
    }

    public static void test02() throws IOException {
        // 字符缓冲输入流, 新增的方法: String readLine(); 读取一行
        // BufferedReader(Reader in): 真正操作文件靠参数传入的流, BufferedReader提供8192大小的缓冲数组
        BufferedReader br = new BufferedReader(new FileReader("day10-io\\abc\\1.txt"));
        // String line = br.readLine();
        // System.out.println(line);
        //
        // line = br.readLine();
        // System.out.println(line);
        //
        // line = br.readLine();
        // System.out.println(line); // 没有数据返回null

        String line; // 报读读取的一行数据
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

    public static void test01() throws IOException {
        // 字符缓冲输出流, 新增的方法: void newLine(); 换行
        // BufferedWriter(Writer out): 真正操作文件靠参数传入的流, BufferedWriter提供8192大小的缓冲数组
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10-io\\abc\\1.txt"));
        bw.write("今天又是新的一天, 元气满满, 嘤嘤嘤1");
        bw.newLine();
        bw.write("今天又是新的一天, 元气满满, 嘤嘤嘤2");
        bw.newLine();
        bw.write("今天又是新的一天, 元气满满, 嘤嘤嘤3");
        bw.close();
    }
}
