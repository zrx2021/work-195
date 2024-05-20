package xuan.demo10自定义异常;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        try {
            test(age);
        } catch (U18Expection e) {
            System.out.println("您的年龄低于18岁！不能上网！" + e);
        }
    }

    public static void test(int age) throws U18Expection {
        if (age >= 18) {
            System.out.println("恭喜你年龄通过！");
        } else {
            throw new U18Expection("您的年龄低于18岁！");
        }
    }
}
