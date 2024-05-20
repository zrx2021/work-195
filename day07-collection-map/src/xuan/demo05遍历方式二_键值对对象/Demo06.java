package xuan.demo05遍历方式二_键值对对象;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
目标: 学习Map遍历方式二_键值对
    认识键值对 Map.Entry保存一个键和一个值(键值对对象)
 */
public class Demo06 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("黄晓明", "杨颖");
        map.put("老干爹", "老干妈");

        // 1.获取所有的Entry
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 2.遍历获取每个Entry
        for (Map.Entry<String, String> entry : entrySet) {
            // 3.通过Entry获取键和获取值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " == " + value);
        }
    }
}
