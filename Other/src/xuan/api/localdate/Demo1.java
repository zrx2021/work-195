package xuan.api.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo1 {
    public static void main(String[] args) {
        String birthday1 = "2000年01月22日";
        String birthday2 = "2000年01月22日";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        LocalDate ld1 = LocalDate.parse(birthday1, formatter);
        LocalDate ld2 = LocalDate.parse(birthday2, formatter);

        if (ld1.isBefore(ld2)) {
            System.out.println("ld1的年龄比ld2的大");
        } else {
            System.out.println("ld1的年龄比ld2的大");
        }
    }
}
