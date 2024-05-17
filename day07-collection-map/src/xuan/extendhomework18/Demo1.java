package xuan.extendhomework18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (map.size() < 5) {
            System.out.println("请输入书名和价格，格式：“书名,价格”：");
            String[] split = sc.next().split(",");
            map.put(split[0], Double.parseDouble(split[1]));
        }

        map.remove("C++");
        Double javaPrice = map.get("Java");
        map.put("Java", javaPrice + 38.5);

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("书名：" + next + "，价格：" + map.get(next));
        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("书名：" + entry.getKey() + "，价格：" + entry.getValue());
        }
    }
}
