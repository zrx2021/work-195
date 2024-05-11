package xuan.demo09权限修饰符01;

public class Other {
    // 同一个包中的无关类
    public void test02() {
        // 不相关的类, 创建对象, 再调用方法
        Fu fu = new Fu();
        fu.testPublic();
        fu.testProtected();
        fu.testDefault();
        // fu.testPrivate();
    }
}
