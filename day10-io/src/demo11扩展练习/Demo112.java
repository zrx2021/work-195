package demo11扩展练习;

import demo11扩展练习.Student;

import java.io.*;
import java.util.*;

/*
定义Student类包含:学号,姓名,年龄,成绩四个属性
键盘输入4个学生信息, 输入格式如下: 学号,姓名,年龄,成绩
把输入的学生信息保存到stu.txt文件中,一行一个学生信息
读取stu.txt文件中的学生的信息保存到Student学生对象中,并按照年龄排序
把排序后的学生对象按照如下格式: 学号-姓名-年龄-成绩 一行一个对象数据保存到stu2.txt中
 */
public class Demo112 {
    public static void main(String[] args) throws IOException {
        // 键盘输入4个学生信息, 输入格式如下: 学号,姓名,年龄,成绩
        FileWriter fw = new FileWriter("day10-io\\abc\\stus.txt");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("请输入第 " + (i + 1) + "个学生信息(输入格式如下: 学号,姓名,年龄,成绩):");
            String info = sc.next();
            // 把输入的学生信息保存到stu.txt文件中,一行一个学生信息
            fw.write(info);
            fw.write("\r\n");
        }
        fw.close(); // 及时关闭字符流, 否则文件没有数据

        // 读取stu.txt文件中的学生的信息保存到Student学生对象中,并按照年龄排序
        List<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("day10-io\\abc\\stus.txt"));
        String line; // 保存一行数据
        while ((line = br.readLine()) != null) {
            // line = "学号,姓名,年龄,成绩"
            // 保存到Student学生对象中
            String[] split = line.split(","); // {"学号", "姓名", "年龄", "成绩"}
            int age = Integer.parseInt(split[2]); // "18" -> 18
            double score = Double.parseDouble(split[3]); // "99.0" -> 99.0
            Student stu = new Student(split[0], split[1], age, score);
            list.add(stu);
        }
        // 并按照年龄排序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println("排序后: " + list);

        // 把排序后的学生对象按照如下格式: 学号-姓名-年龄-成绩 一行一个对象数据保存到stus2.txt中
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10-io\\abc\\stus2.txt"));
        for (Student s : list) {
            bw.write(s.getId() + "-" + s.getName() + "-" + s.getAge() + "-" + s.getScore());
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
