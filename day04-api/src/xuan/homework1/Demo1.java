package xuan.homework1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("请输入字符串：");
        String str1 = sb.append(sc.next()).toString();
        String str2 = sb.reverse().toString();
        if (str1.equals(str2)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}
