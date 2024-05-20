package xuan.homework3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("F:\\MyFileTest\\sg.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("出现了异常" + e);
        }

        System.out.println("---------------");

        try (FileReader fr = new FileReader("F:\\MyFileTest\\sg.txt")) {
            char[] bytes = new char[1024 * 8];
            int len;
            while ((len = fr.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, len));
            }
        } catch (FileNotFoundException e) {
            System.out.println("出现了FileNotFoundException异常" + e);
        } catch (IOException e) {
            System.out.println("出现了IOException异常" + e);
        }
    }
}
