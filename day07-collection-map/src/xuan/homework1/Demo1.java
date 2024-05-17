package xuan.homework1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("腾讯", "马化腾");
        map.put("阿里巴巴", "马云");
        map.put("百度", "李彦宏");
        map.put("京东", "刘强东");

        Set<String> strings = map.keySet();

        for (String string : strings) {
            System.out.println(string + " :: " + map.get(string));
        }
        System.out.println();

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " == " + entry.getValue());
        }
        System.out.println();

        map.forEach((k, v) -> {
            System.out.println(k + " -- " + v);
        });
    }
}
