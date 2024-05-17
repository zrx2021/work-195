package xuan.extendhomework15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String next = sc.nextLine();
        Map<String, Integer> map = new HashMap<>();

        map.put("英文字母", 0);
        map.put("空格", 0);
        map.put("数字", 0);
        map.put("其它字符", 0);

        for (int i = 0; i < next.length(); i++) {
            char c = next.charAt(i);
            Integer count = 0;
            String str;

            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                str = "英文字母";
            } else if (c == ' ') {
                str = "空格";
            } else if (c >= '0' && c <= '9') {
                str = "数字";
            } else {
                str = "其它字符";
            }

            count = map.get(str);
            map.put(str, count + 1);
        }
        System.out.println(map);
    }
}
