package xuan.extendhomework1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名：");
        String inputUserName = sc.next();
        System.out.println("您输入的用户名是：" + (inputUserName.matches("[a-zA-Z]\\w{5,11}") ? "合法的" : "非法的"));
    }
}
