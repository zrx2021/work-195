package xuan.demo10权限修饰符02;

import xuan.demo09权限修饰符01.Fu;

public class Other2 {
    // 不同包的无关类
    public void test04() {
        // 无关类, 创建对象, 再调用方法
        Fu f = new Fu();
        f.testPublic();
        // f.testProtected();
        // f.testDefault();
        // f.testPrivate();
    }
}
