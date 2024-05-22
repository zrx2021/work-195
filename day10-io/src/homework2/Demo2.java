package homework2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo2 {
    public static void main(String[] args) {
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10-io\\homework\\homework2.txt"), "gbk")) {
            osw.write("我爱Java");
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常" + e);
        } catch (IOException e) {
            System.out.println("IO流异常" + e);
        }
    }
}
