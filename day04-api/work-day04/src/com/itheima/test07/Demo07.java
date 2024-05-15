package com.itheima.test07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
DateTimeFormatter类
    请编写程序，使用LocalDateTime类获取日历对象，使用DateTimeFormatter把时间转换为yyyy年MM月dd日 HH时mm分ss秒
 */
public class Demo07 {
    public static void main(String[] args) {
        // 1.创建LocalDateTime对象
        LocalDateTime now = LocalDateTime.now();

        // 2.创建DateTimeFormatter对象,指定时间格式
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");

        // 3.格式化为指定内容 format
        // String format = sdf.format(now);
        // System.out.println("format = " + format);

        String format2 = now.format(sdf);
        System.out.println("format2 = " + format2);
    }
}
