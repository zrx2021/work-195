package homework1;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10-io\\homework\\a.txt")); BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10-io\\homework\\b.txt"))) {
            byte[] bytes = new byte[1024 * 8];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件异常" + e);
        } catch (IOException e) {
            System.out.println("IO异常" + e);
        }
    }
}
