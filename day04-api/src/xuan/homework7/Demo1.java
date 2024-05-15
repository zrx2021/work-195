package xuan.homework7;

import java.time.LocalDateTime;

public class Demo1 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        LocalDateTime after100Days = ldt.plusDays(100);

        System.out.println("after100Days = " + after100Days);
    }
}
