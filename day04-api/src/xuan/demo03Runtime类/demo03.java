package xuan.demo03Runtime类;

import java.io.IOException;

public class demo03 {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();

        System.out.println("处理器数量：" + rt.availableProcessors());

        Student[] stu = new Student[10000000];

        for (int i = 0; i < 10000000; i++) {
            stu[i] = new Student("测试学生", 123);
        }

        System.out.println("内存总量：" + (rt.totalMemory() / 1024 / 1024) + "MB");

        System.out.println("可用内存：" + (rt.freeMemory() / 1024 / 1024) + "MB");

        // 已用内存
        System.out.println((rt.totalMemory() - rt.freeMemory()) / 1024 / 1024 + "MB");

        rt.exec("calc");

        // 终止运行虚拟机，参数作为状态代码，非零状态表示异常终止
        rt.exit(0);
    }
}
