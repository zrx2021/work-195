package xuan.demo07静态方法和实例方法的引用;

public class MyUtils {
    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public int getMax2(int a, int b) {
        return a > b ? a : b;
    }
}
