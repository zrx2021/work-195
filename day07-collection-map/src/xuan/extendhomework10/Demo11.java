package xuan.extendhomework10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的信息：");
            String next = sc.next();
            String[] strings = next.split(",");

            map.put(strings[0], Integer.parseInt(strings[1]));
        }

        System.out.println(map);
    }
}
