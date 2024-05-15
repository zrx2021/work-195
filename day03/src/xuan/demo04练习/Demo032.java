package xuan.demo04练习;

import java.util.Scanner;

public class Demo032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字，范围0~3：");
        int index = sc.nextInt();

        if (index < 0 || index > 3) {
            System.out.println("输入不合法");
        }

        Season season = Season.values()[index];

        switch (season) {
            case SPRING:
                System.out.println("推荐去厦门旅游");
                break;
            case SUMMER:
                System.out.println("推荐去黑龙江旅游");
                break;
            case AUTUMN:
                System.out.println("推荐去云南旅游");
                break;
            case WINTER:
                System.out.println("推荐去海南旅游");
                break;
        }
    }
}
