package homework3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student("张三", 18, '男');
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10-io\\homework\\stu.txt"))) {
            oos.writeObject(student);
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常" + e);
        } catch (IOException e) {
            System.out.println("IO异常" + e);
        }
    }
}
