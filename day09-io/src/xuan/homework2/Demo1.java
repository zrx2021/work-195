package xuan.homework2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        byte[] bytes = new byte[1024 * 8];
        int len;
        try (FileInputStream fis = new FileInputStream("F:\\MyFileTest\\image\\xyz.jpg"); FileOutputStream fos = new FileOutputStream("F:\\MyFileTest\\image\\zly.jpg")) {
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException" + e);
        } catch (IOException e) {
            System.out.println("IOException" + e);
        }
    }
}
