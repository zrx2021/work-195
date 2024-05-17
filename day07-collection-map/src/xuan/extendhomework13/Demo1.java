package xuan.extendhomework13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " == " + entry.getValue());
        }

        map.put(5, "李晓红");
        map.remove(1);
        map.put(2, "周林");

        System.out.println("---------------");
        map.forEach((integer, s) -> {
            System.out.println(integer + " == " + s);
        });
    }
}
