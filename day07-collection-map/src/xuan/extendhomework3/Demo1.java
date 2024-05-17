package xuan.extendhomework3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        // 1.创建HashMap
        HashMap<String, String> map = new HashMap<String, String>();

        // 2.使用put方法添加元素
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        map.put("黄晓明", "Baby");
        map.put("谢霆锋", "张柏芝");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
