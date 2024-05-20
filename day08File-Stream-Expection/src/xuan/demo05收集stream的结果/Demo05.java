package xuan.demo05收集stream的结果;

import java.util.*;
import java.util.stream.Collectors;

/*
目标:学习收集Stream流结果

    1.把流中的数据保存到List集合中
    2.把流中的数据保存到Set集合中
    3.把流中的数据保存到Map集合中
    4.把流中的数据保存到数组中
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "迪丽热巴", "宋远桥", "老子", "庄子", "孙子");

        // 假设对流中的数据处理完毕啦, 要把操作后的数据保存到集合或数组中
        // 1.把流中的数据保存到List集合中
        // List<String> list2 = list.stream().skip(2).collect(Collectors.toList());
        // System.out.println("list2 = " + list2);

        // 2.把流中的数据保存到Set集合中
        // Set<String> set = list.stream().skip(2).collect(Collectors.toSet());
        // System.out.println("set = " + set);

        // 3.把流中的数据保存到Map集合中, Collectors.toMap要手写            toMap(键的处理Lambda, 值的处理Lambda)
        Map<String, Integer> map = list.stream().skip(2).collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println("map = " + map);

        // 4.把流中的数据保存到数组中
        Object[] arr = list.stream().skip(2).toArray();
        for (Object o : arr) {
            // 强制转换
            String s = (String) o;
            System.out.println(s + " : " + s.length());
        }
    }
}
