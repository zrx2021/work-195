package xuan.demo05遍历方式一_键找值;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("黄晓明", "杨颖");
        map.put("老干爹", "老干妈");

        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key + " == " + value);
        }
    }
}
