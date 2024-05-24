package extendhomework7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo1 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("day10-io\\homework\\extendhomework6.txt"));
            ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } catch (IOException e) {
            System.out.println("读取文件时IO异常");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到类异常");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("关闭文件时IO异常");
                }
            }
        }
    }
}
