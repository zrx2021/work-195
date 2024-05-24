package extendhomework13;

import extendhomework12.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        List<Student> students;

        try {
            ois = new ObjectInputStream(new FileInputStream("day10-io\\homework\\stus.txt"));
            Object readObject = ois.readObject();
            students = (List<Student>) readObject;

            for (Student student : students) {
                System.out.println(student);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } catch (IOException e) {
            System.out.println("文件IO异常" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("找不到类异常");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("关闭文件时出现IO异常");
                }
            }
        }
    }
}
