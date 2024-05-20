package xuan.demo18递归求n的阶乘;

/*
递归解决问题的思想:
    把一个大问题拆分为类似的小问题
    找到递归的规律,递归的终止条件

    根据找到递归的规律,递归的终止条件编写递归方法
 */
public class Demo18 {
    public static double totalValue = 0;

    public static void main(String[] args) {
        long result = f(20L);
        System.out.println(result);
        long sum = getSum(5);
        System.out.println("sum = " + sum);
    }

    public static long f(long n) {
        if (n == 1) {
            return 1L;
        } else {
            return n * f(n - 1);
        }
    }

    public static long getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }
}
