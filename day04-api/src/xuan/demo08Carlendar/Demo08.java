package xuan.demo08Carlendar;

import java.util.Calendar;
import java.util.Date;

public class Demo08 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        // 日历字段常量：Calendar.xxx
        // int.get(int field) 返回给点日历字段的值
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // 3.getTimeInMillis()：获取时间毫秒值
        long timeInMillis = calendar.getTimeInMillis();
        System.out.println("timeInMillis = " + timeInMillis);

        // 4.getTime()：获取当前日期对象
        Date date = calendar.getTime();
        System.out.println("date = " + date);

        // 5.void set(int field, int value) 将给定的日历字段设置为给定的值（绝对值）
        // calendar.set(Calendar.YEAR, 2077);
        // calendar.set(Calendar.HOUR_OF_DAY, 10);
        // System.out.println("calendar = " + calendar);

        // 6.一次性改多个值
        calendar.set(2025, 0, 1, 10, 20, 30);
        System.out.println("calendar = " + calendar);

        // 7.void add(int field, int amount) 在当前日历上，将日历字段添加或减去给定值
        // 100天后
        calendar.add(Calendar.DAY_OF_MONTH, 100);
        System.out.println("add后 = " + calendar);
    }
}
