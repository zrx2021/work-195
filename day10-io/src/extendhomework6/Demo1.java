package extendhomework6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args) {
        Student s = new Student("jack", 20, '男');
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("day10-io\\homework\\extendhomework6.txt"));
            oos.writeObject(s);
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } catch (IOException e) {
            System.out.println("文件IO异常" + e);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                System.out.println("关闭文件时IO异常");
            }
        }
    }
}
