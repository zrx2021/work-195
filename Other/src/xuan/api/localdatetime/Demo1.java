package xuan.api.localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo1 {
    public static void main(String[] args) {
        String time = "2022年12月13日 15时16分17秒";
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");

        LocalDateTime ldt = LocalDateTime.parse(time, dtf1);

        LocalDateTime add1000Days = ldt.plusDays(1000L);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        System.out.println("加1000天并格式化：" + add1000Days.format(dtf2));
    }
}
