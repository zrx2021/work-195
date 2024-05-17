package xuan.homework2;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        String str = "aababcabcdabcdd";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char choose = str.charAt(i);
            if (!map.containsKey(choose)) {
                map.put(choose, 1);
            } else {
                Integer integer = map.get(choose);
                map.put(choose, integer + 1);
            }
        }

        map.forEach((k, v) -> {
            System.out.println("答案" + k + "出现" + v);
        });
    }
}
