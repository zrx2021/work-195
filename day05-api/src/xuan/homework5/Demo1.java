package xuan.homework5;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个电话号码：");
        String phoneNumber = sc.next();
        System.out.println("您输入的电话号码是：" + (isCorrectPhoneNumber(phoneNumber) ? "正确的" : "不正确的"));
    }

    private static boolean isCorrectPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("1[3-9][0-9]{9}");
    }
}
