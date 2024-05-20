package xuan.demo09Map3个实现类的特点;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
目标: 演示Map3个实现类的特点
 */
public class Demo09 {
    public static void main(String[] args) {
        // Map<String, Integer> map = new HashMap<>(); // 存储和取出没有顺序, 键不能重复, 没有索引
        // Map<String, Integer> map = new LinkedHashMap<>(); // 存储和取出有顺序, 键不能重复, 没有索引
        Map<String, Integer> map = new TreeMap<>(); // 按照键排序, 键不能重复, 没有索引

        map.put("xiaomi12", 30);
        map.put("vivo", 30);
        map.put("vivo", 66); // 重复的键，后面的会覆盖前面的
        map.put("oppo", 30);
        map.put("iphone14", 1);
        map.put("huawei", 10000);

        System.out.println("map = " + map);
    }
}
