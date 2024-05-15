package xuan.demo04Math类;

public class Demo04 {
    public static void main(String[] args) {
        // 1.public static int abs(int a): 获取绝对值
        System.out.println(Math.abs(5)); // 5
        System.out.println(Math.abs(-5)); // 5
        // 2.public static double abs(double a): 获取绝对值
        System.out.println(Math.abs(5.0));// 5.0
        System.out.println(Math.abs(-5.0));// 5.0

        System.out.println("------向上取整-------");
        // 3.public static double ceil(double a): 向上取整
        System.out.println(Math.ceil(5.6));// 6.0
        System.out.println(Math.ceil(5.1));// 6.0
        System.out.println(Math.ceil(-5.6));// -5.0
        System.out.println(Math.ceil(-5.1));// -5.0

        System.out.println("------向下取整-------");
        // 4.public static double floor(double a): 向下取整
        System.out.println(Math.floor(5.6));// 5.0
        System.out.println(Math.floor(5.1));// 5.0
        System.out.println(Math.floor(-5.6));// -6.0
        System.out.println(Math.floor(-5.1));// -6.0

        System.out.println("------四舍五入-------");
        // 5.public static long round(double a): 四舍五入
        System.out.println(Math.round(5.1));// 5
        System.out.println(Math.round(5.5));// 6
        System.out.println(Math.round(-5.4));// -5
        System.out.println(Math.round(-5.5));// -5

        System.out.println("------获取两个数的较大值-------");
        // 6.public static int max(int a, int b): 获取两个数的较大值
        System.out.println(Math.max(10, 20));// 20
        System.out.println(Math.max(-10, -10));// -10

        System.out.println("------获取幂-------");
        // 7.public static double pow(double a, double b): 获取幂
        System.out.println(Math.pow(2, 3));// 8
        System.out.println(Math.pow(2, 10));// 1024

        System.out.println("------获取[0,1)的随机数-------");
        // 8.public static double random(): 获取[0,1)的随机数
        System.out.println(Math.random());
    }
}
