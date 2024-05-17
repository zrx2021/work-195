package xuan.extendhomework5;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phoneNumber = sc.next();

        checkValidPhoneNumber(phoneNumber);
    }

    private static void checkValidPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber.trim();
        char[] chars = new char[3];

        chars[0] = phoneNumber.charAt(phoneNumber.length() - 1);
        chars[1] = phoneNumber.charAt(phoneNumber.length() - 2);
        chars[2] = phoneNumber.charAt(phoneNumber.length() - 3);

        if (phoneNumber.length() != 11) {
            System.out.println("您输入的手机号位数有误");
            return;
        } else if (!phoneNumber.matches("[1-9]\\d{10}")) {
            System.out.println("您输入的手机号码存在非法字符");
            return;
        }

        if (chars[0] == chars[1] && chars[1] == chars[2]) {
            System.out.println("手机号：" + phoneNumber + "是靓号！");
        } else {
            System.out.println("手机号：" + phoneNumber + "不是靓号！");
        }
    }
}
