package xuan.Demo09构造器引用;

/*
目标: 学习构造器引用
    格式: 类名::new
    前提: Lambda表达式中仅仅是调用了构造器
    拿构造器替代一个抽象方法的重写
 */
public class Demo09 {
    public static void main(String[] args) {
        // 匿名内部类
        test01(new B() {
            @Override
            public Student createStudent(String name, int age) {
                return new Student(name, age);
            }
        });
        // ↓
        test01(((name, age) -> new Student(name, age)));
        // ↓
        test01(Student::new);
    }

    public static void test01(B b) {
        Student stu = b.createStudent("张三", 18);
        System.out.println("stu = " + stu);
    }
}
