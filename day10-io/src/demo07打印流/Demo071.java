package demo07打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/*
目标: 学习打印流的使用
 */
public class Demo071 {
    public static void main(String[] args) throws FileNotFoundException {
        // PrintStream: 字节打印流, 打印任意数据, 原样输出, 字节流会直接到文件 (推荐)
        PrintStream ps = new PrintStream("day10-io\\abc\\ps.txt");

        // ps.print(11);
        // ps.print(6.66);
        // ps.print('a');
        // ps.print("你好呀");
        // ps.print(true);

        // println: 先打印, 后换行
        ps.println(11);
        ps.println(97);
        ps.println(1.1);
        ps.println('a');
        ps.println("你好");
        ps.println(true);

        ps.close();

        System.out.println("---------------");

        // PrintWriter: 字符打印流, 原样输出, 字符流不会直接到文件, 需要刷新或close
        PrintWriter pw = new PrintWriter("day10-io\\abc\\pw.txt");
        pw.println(11);
        pw.println(97);
        pw.println(1.1);
        pw.println('a');
        pw.println("你好");
        pw.println(true);

        pw.close();
    }
}
