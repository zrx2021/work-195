package xuan.demo06Lambda表达式;

import xuan.demo05自定义排序.Student;

import java.util.Arrays;

public class Demo061 {
    public static void main(String[] args) {
        Student[] stu = new Student[4];
        stu[0] = new Student("迪丽热巴", 28, 1.77);
        stu[1] = new Student("古丽娜扎", 18, 1.87);
        stu[2] = new Student("马尔扎哈", 22, 1.67);
        stu[3] = new Student("摩托摩拉", 33, 1.47);

        Arrays.sort(stu, (Student a, Student b) -> {
            return Double.compare(a.getHeight(), b.getHeight());
        });

        System.out.println();
    }
}
