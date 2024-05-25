package xuan.demo10Object类的toString方法;

/*
目标: 了解Object类的clone方法

    Object类的clone方法: 复制一个新对象,对象的属性是相同的

    注意事项:
        1.子类中需要重写clone()
        2.子类需要实现Cloneable接口
 */
public class Demo103clone方法 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("张三", 18);
        System.out.println("s1 = " + s1);

        // 有红色波浪线, 光标放上面 -> Add exception to method signature
        // 在Student类中重写了Clone，使protected的方法与本类在同一个包中，这样才能调用clone方法
        Student s2 = (Student) s1.clone();
        System.out.println("s2 = " + s2);
        System.out.println(s1 == s2);
    }
}
