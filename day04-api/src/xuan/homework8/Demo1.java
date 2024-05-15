package xuan.homework8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo1 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");

        String format = ldt.format(dtf);
        System.out.println(format);
    }
}
