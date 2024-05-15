package com.itheima.test03;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
请在控制台以“xxxx年xx月xx日 xx时xx分xx秒”的格式打印当前系统时间

思路
    1.通过Date()构造方法，获取当前时间
    2.创建SimpleDateFormat的对象，指定时间格式为 "yyyy年MM月dd日 HH时mm分ss秒"
    3.使用SimpleDateFormat的format()方法，传入Date对象，实现把时间转化为指定格式的字符串
 */
public class Demo03 {
    public static void main(String[] args) {
        // 1.通过Date()构造方法，获取当前时间
        Date time = new Date();

        // 2.创建SimpleDateFormat的对象，指定时间格式为 "yyyy年MM月dd日 HH时mm分ss秒"
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        // 3.使用里面的format()方法，转化毫秒值/date
        String str = sdf.format(time);
        System.out.println(str);
    }
}
