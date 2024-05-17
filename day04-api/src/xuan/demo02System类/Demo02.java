package xuan.demo02System类;

import java.util.Scanner;

/*
    目标: 能够通过System获取当前时间的毫秒值
 */
public class Demo02 {
    public static void main(String[] args) {
        // 1.public static void exit(int status): 终止当前运行的Java虚拟机(退出程序)
        System.out.println("aa");
        // System.exit(0);
        System.out.println("bb");

        // 2.public static long currentTimeMillis(): 获取当前系统的时间(单位是毫秒) 统计代码的耗时
        // 开始时间
        long start = System.currentTimeMillis();
        System.out.println("start = " + start); // 1715563287017

        // 执行一段代码
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }

        // 结束时间
        long end = System.currentTimeMillis();

        // 统计耗时 = 结束时间 - 开始时间
        System.out.println("耗时: " + (end - start)); // 814ms    ->  0.814s

        // 扩展: System.out标准输出,IDEA输出到控制台黑色
        // 扩展: System.err错误输出,IDEA输出到控制台红色, 一个新的线程(一个新的人干活)
        System.err.println("我错啦?");

        // 扩展: System.in: 得到控制台的内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入内容: ");
        String str2 = sc.next();
        System.out.println("str2 = " + str2);
    }
}
