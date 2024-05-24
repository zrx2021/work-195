package extendhomework9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Demo1 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream("day10-io\\homework\\extendhomework9.txt"));
            pw.print("我爱Java");
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }

    }
}
