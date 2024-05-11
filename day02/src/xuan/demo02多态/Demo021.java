package xuan.demo02多态;

/*
    目标：了解多态格式
    变量不存在重写，多态不考虑变量，多态时变量还是使用“=”左边的父类
    多态条件：
        1.存在继承/实现
        2.存在父类引用子类对象
        3.存在方法重写
 */
public class Demo021 {
    public static void main(String[] args) {
        // 以前：类名 对象名 = new 类名();
        Student s1 = new Student();
        Teacher t1 = new Teacher();

        // 多态格式：父类/接口 对象名 = new 子类();
        // 方法编译看左边父类
        // 方法运行看右边子类
        Person p1 = new Student();
        p1.run();// 走子类重写方法
        System.out.println(p1.name);// 张三

        Person p2 = new Teacher();
        p2.run();// 走子类重写方法
        System.out.println(p2.name);// 张三
    }
}
