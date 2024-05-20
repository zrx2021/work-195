package xuan.demo05遍历方式一_键找值;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
目标: Map遍历方式一_键找值
 */
public class Demo05 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("黄晓明", "杨颖");
        map.put("老干爹", "老干妈");

        // 1.获取所有的键
        Set<String> keySet = map.keySet();
        // 2.遍历获取每个键
        for (String key : keySet) {
            // 3.使用键找值
            String value = map.get(key);
            System.out.println(key + " == " + value);
        }
    }
}
