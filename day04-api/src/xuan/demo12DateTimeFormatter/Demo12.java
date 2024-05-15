package xuan.demo12DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo12 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();

        String formatted = now.format(dtf);
        System.out.println("formatted = " + formatted);

        LocalDateTime ldt = LocalDateTime.parse("2012-12-12 12:12:12", dtf);
        System.out.println("ldt = " + ldt);
    }
}
