package xuan.homework4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        try (FileWriter fw = new FileWriter("F:\\MyFileTest\\student.txt")) {
            while (true) {
                System.out.println("请输入学生姓名:");
                String name = sc.next();
                if (count >= 3) {
                    System.out.println("结束程序");
                    break;
                }
                System.out.println("请输入学生年龄:");
                int age = sc.nextInt();
                fw.write(name + "," + age);
                fw.write("\r\n");
                count++;
            }
        } catch (IOException e) {
            System.out.println("抛出了IOException异常");
        }
    }
}
