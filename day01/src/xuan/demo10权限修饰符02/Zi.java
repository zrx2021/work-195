package xuan.demo10权限修饰符02;

import com.itheima.demo09权限修饰符01.Fu;

public class Zi extends Fu {
    // 不同包的子类
    public void test03() {
        // 子类可以直接使用父类的方法
        testPublic();
        testProtected();
        // testDefault();
        // testPrivate();
    }
}
