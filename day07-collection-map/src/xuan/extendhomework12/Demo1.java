package xuan.extendhomework12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("柳岩", 2100);
        map.put("张亮", 1700);
        map.put("诸葛亮", 1800);
        map.put("灭绝师太", 2600);
        map.put("东方不败", 3800);

        Integer salary = map.get("柳岩");
        salary += 300;
        map.put("柳岩", salary);

        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("姓名：" + next + "薪资：" + map.get(next));
        }
    }
}
