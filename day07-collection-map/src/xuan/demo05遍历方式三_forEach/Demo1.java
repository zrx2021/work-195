package xuan.demo05遍历方式三_forEach;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("黄晓明", "杨颖");
        map.put("老干爹", "老干妈");

        // 使用map的forEach方式遍历
        // map.forEach(new BiConsumer<String, String>() {
        //     @Override
        //     public void accept(String k, String v) {
        //         System.out.println(k + " == " + v);
        //     }
        // });

        // Lambda表达式
        // 需要记住, Map遍历的最佳方案
        map.forEach((k, v) -> {
            System.out.println("Key：" + k + "，Value：" + v);
        });
    }
}
