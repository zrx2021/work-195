package extendhomework14;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader("day10-io\\homework\\ccc.txt"));
            pw = new PrintWriter("day10-io\\homework\\ccc1.txt");

            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } catch (IOException e) {
            System.out.println("读取文件时出现IO异常");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
