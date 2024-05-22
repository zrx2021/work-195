package demo07打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo072 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("abcdefg");
        System.out.println("1234567");

        PrintStream ps = new PrintStream("day10-io\\abc\\日志.txt");
        System.setOut(ps);

        System.out.println("hijklmn");
        System.out.println("89101112");
    }
}
