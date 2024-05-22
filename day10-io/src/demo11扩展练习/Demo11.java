package demo11扩展练习;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    定义Student类包含:学号,姓名,年龄,成绩四个属性
    键盘输入4个学生信息, 输入格式如下: 学号,姓名,年龄,成绩
    把输入的学生信息保存到stu.txt文件中,一行一个学生信息
    读取stu.txt文件中的学生的信息保存到Student学生对象中,并按照年龄排序
    把排序后的学生对象按照如下格式: 学号-姓名-年龄-成绩 一行一个对象数据保存到stu2.txt中
 */
public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("day10-io\\abc\\stu.txt"))) {
            for (int i = 0; i < 4; i++) {
                System.out.println("请输入学生信息，格式如下: 学号,姓名,年龄,成绩：");
                String info = sc.nextLine();
                bw.write(info);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("处理了异常" + e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("day10-io\\abc\\stu.txt")); PrintWriter pw = new PrintWriter("day10-io\\abc\\stu2.txt")) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] strings = line.split(",");
                studentList.add(new Student(strings[0], strings[1], Integer.parseInt(strings[2]), Double.parseDouble(strings[3])));
                studentList.sort((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
            }

            for (Student student : studentList) {
                // 在Student中重写了toString方法
                pw.println(student);
            }

        } catch (IOException e) {
            System.out.println("处理了异常" + e);
        }
    }
}
