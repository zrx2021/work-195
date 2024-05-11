package xuan.demo09权限修饰符01;

/*
目标: 验证这4种权限修饰符

    常用:
        private: 本类使用
        public: 所有地方都能使用
    不常用:
        缺省的: 给同一个包中的类使用
        protected: 给子类使用
 */
public class Fu {
    // 修饰方法
    public void testPublic() {}
    protected void testProtected() {}
    void testDefault() {}
    private void testPrivate() {}

    // 本类的方法
    public void test01() {
        testPrivate();
        testDefault();
        testProtected();
        testPublic();
    }
}
