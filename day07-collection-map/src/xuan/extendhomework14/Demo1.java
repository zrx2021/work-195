package xuan.extendhomework14;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String next = sc.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < next.length(); i++) {
            char key = next.charAt(i);
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                Integer count = map.get(key);
                map.put(key, count + 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
        }
    }
}
