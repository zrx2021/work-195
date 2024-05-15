package com.itheima.test05;

import java.time.LocalDateTime;

/*
LocalDateTime类
    请编写程序，使用LocalDateTime类获取日历对象，并分别获取年、月、日、小时、分、秒，并将它们打印到控制台。
 */
public class Demo05 {
    public static void main(String[] args) {
        // 类名.now()
        // LocalDateTime now = LocalDateTime.now();
        // 类名.of(指定时间)
        LocalDateTime now = LocalDateTime.of(2022, 2, 22, 2, 13, 14);

        System.out.println(now);
        System.out.println("年:" + now.getYear());
        System.out.println("月:" + now.getMonthValue());
        System.out.println("日:" + now.getDayOfMonth());
        System.out.println("时:" + now.getHour());
        System.out.println("分:" + now.getMinute());
        System.out.println("秒:" + now.getSecond());
        // 修改的， --> withXxx

        LocalDateTime newTime = now.withYear(2023);
        System.out.println(newTime);

        // 增加值 --> plusXxx
        System.out.println("增加两年:" + now.plusYears(2));

        // 减 --> minusXX
        System.out.println("减去3天" + now.minusDays(3));
    }
}
