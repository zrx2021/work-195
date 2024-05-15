package com.itheima.test06;

import java.time.LocalDateTime;

/*
LocalDateTime类
    请编写程序，使用LocalDateTime类获取日历对象，计算一百天之后是几年几月几日
 */
public class Demo06 {
    public static void main(String[] args) {
        // 先获取当前系统的时间
        LocalDateTime now = LocalDateTime.now();
        // 使用plusDays增加100天
        LocalDateTime newTime = now.plusDays(100);
        System.out.println(newTime);
    }
}
