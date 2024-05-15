package xuan.demo09LocalDate_LocalTime_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

/*
计算你出生那年是平年还是闰年
    使用LocalDate的of方法指定年3月1日
    减一天
    得到天数
*/
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int inputYear = sc.nextInt();
        LocalDate ld = LocalDate.of(inputYear, 3, 1);
        int days = ld.minusDays(1).getDayOfMonth();
        String isTrue = days == 29 ? "闰年" : "平年";
        System.out.println(inputYear + "是" + isTrue);
    }
}
