package xuan.demo08Carlendar;

import java.util.Calendar;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int targetYear = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(targetYear, Calendar.MARCH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(targetYear + "年的2月有：" + calendar.get(Calendar.DAY_OF_MONTH) + "天");
    }
}
