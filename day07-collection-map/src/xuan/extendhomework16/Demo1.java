package xuan.extendhomework16;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("bcd");

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (String s : list) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    Integer count = map.get(c);
                    map.put(c, count + 1);
                }
            }
        }
        System.out.println(map);
    }
}
