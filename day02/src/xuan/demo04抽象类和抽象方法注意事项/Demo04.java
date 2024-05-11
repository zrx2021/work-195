package xuan.demo04抽象类和抽象方法注意事项;

/*
目标:了解抽象类注意事项

    1.抽象方法所在的类必须是抽象类，抽象类中可以没有抽象方法。
    2.类该有的成员（成员变量、方法、构造器）抽象类都可以有
    3.子类必须重写抽象类中的所有抽象方法，如果子类只重写一部分抽象方法子类还是抽象类。
*/

// 1.抽象方法所在的类必须是抽象类
abstract class Fu1 {
    public abstract void test01();
}

// 抽象类中可以没有抽象方法
abstract class Fu2 {
}

// 2.类该有的成员（成员变量、方法、构造器）抽象类都可以有, 抽象类 = 普通类 + 抽象方法
abstract class Fu3 {
    private int a;

    public abstract void test01();

    public void show() {
        System.out.println(a);
    }

    public Fu3() {
    }

    public Fu3(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

abstract class Fu4 {
    public abstract void test01();
    public abstract void test02();
}

// 3.子类必须重写抽象类中的所有抽象方法
class Zi1 extends Fu4 {
    @Override
    public void test01() {}

    @Override
    public void test02() {}
}

// 如果子类只重写一部分抽象方法子类还是抽象类。
abstract class Zi2 extends Fu4 {
    @Override
    public void test01() {}
}

public class Demo04 {
}
