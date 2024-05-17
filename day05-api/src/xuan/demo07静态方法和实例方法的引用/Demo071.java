package xuan.demo07静态方法和实例方法的引用;

public class Demo071 {
    public static void main(String[] args) {
        test01(new A() {
            @Override
            public int max(int a, int b) {
                return MyUtils.getMax(a, b);
            }
        });
        //  ↓
        test01((a, b) -> MyUtils.getMax(a, b));
        //  ↓
        // 移花接木，用已有的方法代替抽象方法
        test01(MyUtils::getMax);
    }

    public static void test01(A a) {
        int max = a.max(10, 20);
        System.out.println("max = " + max);
    }
}
