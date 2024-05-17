package xuan.demo07静态方法和实例方法的引用;

public class Demo072 {
    public static void main(String[] args) {
        MyUtils myUtils = new MyUtils();
        test01(new A() {
            @Override
            public int max(int a, int b) {
                return myUtils.getMax2(a, b);
            }
        });
        // ↓
        test01(((a, b) -> myUtils.getMax2(a, b)));
        // ↓
        test01(myUtils::getMax2);
    }

    public static void test01(A a) {
        int max = a.max(10, 20);
        System.out.println("max = " + max);
    }
}
