package xuan.extendhomework17;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "人的姓名：");
            map.put(sc.next(), r.nextInt(101));
        }

        int sum = -1, min = -1, max = -1;

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (min == -1) {
                min = value;
            }
            if (max == -1) {
                max = value;
            }
            sum += value;
            if (min > value) {
                min = value;
            }
            if (max < value) {
                max = value;
            }
        }

        System.out.println("总分是：" + sum + "，最高分：" + max + "，最低分：" + min + "，平均分：" + sum / 5);
    }
}
