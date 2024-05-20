package xuan.homework1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("F:\\MyFileTest\\homework1.txt", true)) {
            fos.write("i love java".getBytes());
            for (int i = 0; i < 4; i++) {
                fos.write("\r\n".getBytes());
                fos.write("i love java".getBytes());
            }
        } catch (FileNotFoundException e) {
            System.out.println("捕获到文件无法查找异常");
        } catch (IOException e) {
            System.out.println("捕获到IOException异常");
        }
    }
}
