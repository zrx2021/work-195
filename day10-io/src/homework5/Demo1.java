package homework5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (PrintWriter pw = new PrintWriter(new FileWriter("day10-io\\homework\\ps.txt"))) {
            while (true) {
                String str = sc.next();
                if (str.contains("end")) {
                    break;
                }
                pw.println(str);
            }
        } catch (IOException e) {
            System.out.println("IO异常" + e);
        }
    }
}
