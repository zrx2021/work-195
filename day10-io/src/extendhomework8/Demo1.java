package extendhomework8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串");
        String line = sc.nextLine();
        PrintStream ps = null;

        try {
            ps = new PrintStream("day10-io\\homework\\extendhomework8.txt");
            ps.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }
}
