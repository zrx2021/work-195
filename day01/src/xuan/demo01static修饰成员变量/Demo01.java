package xuan.demo01static修饰成员变量;

public class Demo01 {
    public static void main(String[] args) {
        // 静态成员变量使用方式1：类名.静态变量名（推荐）
        Student.teacherName = "张平";

        Student s1 = new Student();
        s1.name = "某某人";
        s1.teacherName = "平哥";

        Student s2 = new Student();
        s2.name = "某某人2";

        System.out.println(s1.name);
        System.out.println(s2.name);

        // 静态成员变量使用方式2：对象.静态变量名
        System.out.println(s1.teacherName);// 平哥
        System.out.println(s2.teacherName);// 平哥
    }
}
