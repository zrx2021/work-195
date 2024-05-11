package xuan.demo07继承;

public class Demo1 {
    public static void main(String[] args) {
        // ctrl + 鼠标左键 悬浮在变量上，方法名上，可以看到是哪个类的
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        s1.score = 100;
        s1.eat();
        s1.study();
        s1.run();

        // 继承后不能使用父类的私有成员
        // s1.password = 666;
        // s1.showPassWord();

        System.out.println("------------");
        Teacher t1 = new Teacher();
        t1.name = "马云";
        t1.age = 60;
        t1.salary = 1;
        t1.eat();
        t1.teach();
        t1.run();
    }
}
