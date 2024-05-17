package xuan.extendhomework1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        // 1.创建HashMap
        HashMap<String, String> map = new HashMap<>();

        // 2.使用put添加元素
        map.put("黄晓明", "Baby");
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("大黑牛", "范冰冰");

        Collection<String> values = map.values();

        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("---------------");

        Iterator<String> iterator = values.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
