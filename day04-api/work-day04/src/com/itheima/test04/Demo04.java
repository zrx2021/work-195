package com.itheima.test04;

import java.util.Calendar;

/*
Calendar类
    请编写程序，使用Calendar类获取日历对象，并分别获取年、月、日、小时、分、秒，并将它们打印到控制台。
 */
public class Demo04 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        System.out.println("年: " + c.get(Calendar.YEAR));
        System.out.println("月: " + (c.get(Calendar.MONTH) + 1)); //是从0开始 它算的
        System.out.println("日: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("时: " + c.get(Calendar.HOUR));
        System.out.println("分: " + c.get(Calendar.MINUTE));
        System.out.println("秒: " + c.get(Calendar.SECOND));
    }
}
