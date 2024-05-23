package xuan.homework3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        Scanner sc = new Scanner(System.in);
        prop.load(new FileReader("day11-file-log-thread\\src\\xuan\\homework3\\config.properties"));

        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        if (prop.getProperty("username").equals(username) && prop.getProperty("password").equals(password)) {
            if (prop.getProperty("color").equals("red")) {
                System.err.println(prop);
            } else if (prop.getProperty("color").equals("black")) {
                System.out.println(prop);
            }
        }
    }
}
