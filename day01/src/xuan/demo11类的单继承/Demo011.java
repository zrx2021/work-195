package xuan.demo11类的单继承;

/*
目标: 了解Java类只能单继承, 可以多层继承
 */

class Fu1 {}
class Fu2 {}

// Java类只能单继承
// class Zi1 extends Fu1, Fu2 {}

// 可以多层继承
class Zi2 extends Fu2 {}
class Sun2 extends Zi2 {}

// 一个类没有写父类自动继承Object
class Fu3 {}
class Fu4 extends Object {}

public class Demo011 {
    public static void main(String[] args) {
        Fu3 f3 = new Fu3();
        f3.hashCode();
    }
}
