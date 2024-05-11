package xuan.demo16调用本类构造器;

public class Demo1 {
    public static void main(String[] args) {
        // 创建3个黑马的学生
        // Student s1 = new Student("张三", "黑马程序员")
        // Student s2 = new Student("李四", "黑马程序员")
        // Student s3 = new Student("王五", "黑马程序员")

        // 简化，调用一个参数构造器，给学生的姓名赋值，校名指定为“黑马程序员”
        Student s4 = new Student("张三");
        Student s5 = new Student("李四");
        Student s6 = new Student("王五");

        System.out.println(s4.getName() + " " + s4.getSchoolName());
    }
}
