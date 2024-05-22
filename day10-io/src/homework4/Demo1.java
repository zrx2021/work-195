package homework4;

import homework3.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo1 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10-io\\homework\\stu.txt"))) {
            Object obj = ois.readObject();
            Student student = (Student) obj;
            System.out.println(student);
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常" + e);
        } catch (IOException e) {
            System.out.println("IO异常" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("类找不到异常" + e);
        }
    }
}
