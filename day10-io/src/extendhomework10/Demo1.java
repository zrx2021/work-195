package extendhomework10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "赵五");

        try {
            pw = new PrintWriter(new FileOutputStream("day10-io\\homework\\Arrays.txt"));
            for (String s : list) {
                pw.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
