package xuan.demo09接口注意事项;

/*
目标: 了解接口注意事项
 */

interface A {
    public abstract void test01();
}

interface B {
    public abstract void test02();
}

// 一个接口可以继承多个接口
interface C extends A, B {
    public abstract void test03();
}

class D implements C {
    public void test01() {}
    public void test02() {}
    public void test03() {}
}

class Person {
    public void eat() {
        System.out.println("父类 Person 吃饭");
    }
}

interface Live {
    public default void eat() {
        System.out.println("接口 Live 吃饭");
    }
}

// 父类的方法和接口默认方法同名, 优先使用父类的 (就近原则)
class Student extends Person implements Live {

}

interface XXX {
    public default void show() {
        System.out.println("我是 XXX 接口 默认方法 show()");
    }
}

interface YYY {
    public default void show() {
        System.out.println("我是 YYY 接口 默认方法 show()");
    }
}

// 类实现多个接口, 多个接口存在同名的默认方法, 实现类需要重写默认方法, 不走接口的
class ZZZ implements XXX, YYY {
    @Override
    public void show() {
        System.out.println("我是 ZZZ 类的重写方法 show()");
    }
}

public class Demo09 {
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();

        ZZZ z = new ZZZ();
        z.show();
    }
}
