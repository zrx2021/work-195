package xuan.homework3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) throws IOException {
        // 1.创建Properties对象
        Properties pp = new Properties();
        FileReader fr = new FileReader("day11-work\\src\\config.properties");
        // 2.使用Properties对象的load方法加载config.properties文件中的数据
        pp.load(fr);
        fr.close();

        // 3.提示户输入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = sc.next();
        System.out.println("请输入密码:");
        String pwd = sc.next();

        // 4.使用Properties对象的getProperty方法获取Properties中的用户名和密码
        String username = pp.getProperty("username");
        String password = pp.getProperty("password");

        // 5.对比用户输入的用户名和密码是否与文件中的用户名和密码是否相同
        if (name.equals(username) && pwd.equals(password)) {
            // 6.如果用户名和密码相同则登录成功, 获取color的值
            String color = pp.getProperty("color");
            if (color.equals("red")) {
                // 7.如果color的值为red使用System.err.println打印登陆成功
                System.err.println("登录成功! " + name);
            } else {
                // 8.否则使用System.out.println打印登陆成功
                System.out.println("登录成功! " + name);
            }
        } else {
            // 9.如果用户名和密码不相同则登录失败, 获取color的值
            String color = pp.getProperty("color");
            if (color.equals("red")) {
                // 10.如果color的值为red使用System.err.println打印登录失败
                System.err.println("登录失败!");
            } else {
                // 11.否则使用System.out.println打印登陆失败
                System.out.println("登录失败!");
            }
        }
    }
}