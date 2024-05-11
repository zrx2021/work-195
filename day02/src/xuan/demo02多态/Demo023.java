package xuan.demo02多态;

public class Demo023 {
    public static void main(String[] args) {
        // 多态：自动类型转换，把子类对象 转成 父类类型
         Person p = new Student();
        //Person p = new Teacher();
        p.run();
        System.out.println("p的姓名是：" + p.name);

        // 多态的弊端：不能使用子类的特有功能，要使用子类特有功能必须进行强制类型转换
        boolean b = p instanceof Student;
        System.out.println("b = " + b);

        if (p instanceof Student) {
            // 要想用子类的功能，需要进行强制类型转换 子类 对象名 = (子类) 父类变量
            // ClassCastException：类型转换异常
            Student s = (Student) p;// 把变量p由Person类型强制转成了Student类型
            s.study();
            System.out.println("s的姓名是：" + p.name);
        } else {
            System.out.println("p不是 Student类型");
        }
    }
}
