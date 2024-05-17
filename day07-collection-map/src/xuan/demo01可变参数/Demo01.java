package xuan.demo01可变参数;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
    }

    private static int add(int... a) {
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        return sum;
    }

    // 可变参数注意事项：有一个方法只能有一个可变参数，并且可变参数需要放在参数列表的最后
    public static void test(int a, double... doubles) {

    }
}
