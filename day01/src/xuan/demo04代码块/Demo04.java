package xuan.demo04代码块;

/*
    静态代码块:是在类加载的时候执行一次(早), 给静态的成员变量赋值
    实例代码块:是在每次构造器前执行, 给普通的成员变量赋值
 */
public class Demo04 {
    public static void main(String[] args) {
        /*
        我是静态代码块

        我是实例代码块
        我是无参构造

        我是实例代码块
        我是无参构造

        我是实例代码块
        我是无参构造
         */
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
    }
}
