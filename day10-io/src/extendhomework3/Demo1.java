package extendhomework3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        try {
            readChar();
            readCharArray();
        } catch (IOException e) {
            System.out.println("IO异常");
        }
    }

    private static void readChar() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10-io\\homework\\scanfiletoconsole.txt"));
        int len;
        while ((len = bis.read()) != -1) {
            System.out.print((char) len);
        }
        bis.close();
    }

    private static void readCharArray() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10-io\\homework\\scanfiletoconsole.txt"));
        int len;
        byte[] bytes = new byte[1024 * 8];
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
    }
}
