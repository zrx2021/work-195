package com.itheima.test06;

import java.util.Objects;
import java.util.Scanner;

/*
键盘录入一个字符串，判断这个字符串是否为对称字符串
例如："上海自来水来自海上" , 就是一个对称的字符串
     "ABCA"，就不是一个对称的字符串

实现思路
    1.键盘录入一个字符串
    2.创建一个StringBuilder对象
    3.通过StringBuilder去拼接键盘录入的字符串
    4.调用StringBuilder的reverse()方法，实现内容的反转
    5.通过StringBuilder的toString()方法，把反转的内容转化为一个新的字符串
    6.用键盘录入的字符串和反转之后的字符串实现内容的比较
 */
public class Demo06 {
    public static void main(String[] args) {
        // 1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符:");
        String str = sc.next();

        // 2.创建一个StringBuilder对象
        // 3.通过StringBuilder去拼接键盘录入的字符串
        StringBuilder sb = new StringBuilder();
        sb.append(str);

        // 4.调用StringBuilder的reverse()方法，实现内容的反转
        // 5.通过StringBuilder的toString()方法，把反转的内容转化为一个新的字符串
        String newStr = sb.reverse().toString();

        // 6.用键盘录入的字符串和反转之后的字符串实现内容的比较
        boolean equals = Objects.equals(str, newStr);
        if (equals) {
            System.out.println(str + " 是对称字符串");
        } else {
            System.out.println(str + " 不是对称字符串");
        }
    }
}
