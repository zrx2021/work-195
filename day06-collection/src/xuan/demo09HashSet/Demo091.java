package xuan.demo09HashSet;

import java.util.HashSet;

public class Demo091 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("王健林", 20, 90));
        students.add(new Student("王林", 21, 91));
        students.add(new Student("通话", 22, 93));// hashcode：1179395
        students.add(new Student("重地", 22, 93));// hashcode：1179395
        students.add(new Student("王健林", 20, 90));

        for (Student student : students) {
            System.out.println("学生姓名：" + student.getName());
            System.out.println("学生年龄：" + student.getAge());
            System.out.println("学生分数：" + student.getScore());
            System.out.println("---------------");
        }
    }
}
