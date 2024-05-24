package extendhomework12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, '男');
        Student s2 = new Student("李四", 19, '女');
        Student s3 = new Student("赵五", 20, '男');

        List<Student> students = new ArrayList<>();
        Collections.addAll(students, s1, s2, s3);
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("day10-io\\homework\\stus.txt"));
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("文件写出时IO异常");
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("关闭文件时出现IO异常");
                }
            }
        }
    }
}
