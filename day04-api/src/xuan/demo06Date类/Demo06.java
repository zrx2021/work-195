package xuan.demo06Date类;

import java.util.Date;

public class Demo06 {
    public static void main(String[] args) {
        // 1.Date(): 创建Date对象,时间为执行这行代码的时间(当前时间)
        Date date = new Date();
        System.out.println("date = " + date);

        // 2.long getTime(): 得到当前对象的时间 和 1970年1月1日 0时0分0秒 相差的毫秒值
        long time = date.getTime();
        System.out.println("time = " + time);

        // 3.void setTime(long time): 修改时间, 时间是在 1970年1月1日 0时0分0秒 基础上增加参数指定的毫秒值
        // date.setTime(1000L * 5);
        // System.out.println("修改后date = " + date);

        // 4.当前时间121s后的时间
        date.setTime(time + 121 * 1000L);
        System.out.println("time = " + time);

        // 5.Date(long date): 创建Date对象,时间是在 1970年1月1日 0时0分0秒 基础上增加参数指定的毫秒值
        Date date1 = new Date(5 * 1000L);
        System.out.println("date1 = " + date1);
    }
}
