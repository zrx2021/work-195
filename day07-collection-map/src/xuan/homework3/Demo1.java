package xuan.homework3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Map<Star, String> map = new HashMap<>();

        Star s1 = new Star("迪丽热巴", 18);
        Star s2 = new Star("古力娜扎", 20);
        Star s3 = new Star("鹿晗", 35);
        Star s4 = new Star("张艺兴", 21);
        Star s5 = new Star("黄渤", 39);

        map.put(s1, "北京");
        map.put(s2, "上海");
        map.put(s3, "天津");
        map.put(s4, "北京");
        map.put(s5, "上海");

        map.remove(s1);
        map.put(s2, "郑州");

        Set<Star> stars = map.keySet();
        for (Star star : stars) {
            System.out.println(star + " == " + map.get(star));
        }

        map.forEach((k, v) -> {
            System.out.println(k + " == " + v);
        });

        Set<Map.Entry<Star, String>> entries = map.entrySet();
        for (Map.Entry<Star, String> entry : entries) {
            System.out.println(entry.getKey() + " == " + entry.getValue());
        }
    }
}
