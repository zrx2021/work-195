package xuan.homework6;

import java.time.LocalDateTime;

public class Demo1 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());
    }
}
