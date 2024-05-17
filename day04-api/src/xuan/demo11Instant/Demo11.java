package xuan.demo11Instant;

import java.time.Instant;

/*
目标: 掌握Instant的使用
    时间线上的某个时刻/时间戳
 */
public class Demo11 {
    public static void main(String[] args) {
        // 1.now(): 获取当前时间的Instant对象（标准时间）
        Instant now = Instant.now();
        System.out.println("now = " + now); // 2024-05-13T09:41:43.593552200Z

        // 2.getEpochSecond(): 获取从1970-01-01T00:00:00 开始的秒数
        long epochSecond = now.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);

        // 3.getNano(): 获取不够1秒的纳秒数
        int nano = now.getNano();
        System.out.println("nano = " + nano);

        // 4.和currentTimeMillis()对比
        long millis = System.currentTimeMillis();
        System.out.println("millis = " + millis);
    }
}
