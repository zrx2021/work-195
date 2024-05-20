package xuan.demo01可变参数;

/*
目标: 学习可变参数的使用
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
    }

    // 定义两个整数求和
    public static int add(int... a) {
        // System.out.println(a); // [I@776ec8df
        // 求和思想
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
