package xuan.demo10自定义异常;

/*
处理异常练习, 给定代码, 练习处理异常
 */
import java.io.FileInputStream;
import java.io.IOException;

public class Demo074 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("异常已经处理！" + e);
        }
    }

    public static void readFile() throws IOException {
        FileInputStream fis = new FileInputStream("aaa");
        int len;
        while ((len = fis.read()) != -1) {
            System.out.print((char) len);
        }

        fis.close();
    }
}