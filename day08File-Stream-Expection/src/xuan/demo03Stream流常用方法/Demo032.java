package xuan.demo03Stream流常用方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo032 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "迪丽热巴", "宋远桥", "宋远桥", "苏星河", "老子", "老子", "庄子", "孙子", "孙子");

        // 1.获取前3个数据
        list.stream().limit(3).forEach(s -> System.out.println(s));
        System.out.println("---------------");

        // 2.跳过前2个数据
        list.stream().skip(2).forEach(s -> System.out.println(s));
        System.out.println("---------------");

        // 扩展，跳过前2条数据，再取前3个数据
        list.stream().skip(2).limit(3).forEach(s -> System.out.println(s));
        System.out.println("---------------");

        // 3.去除重复数据
        list.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println("---------------");

        // 4.映射，转换流中的数据
        Stream<Integer> stream = list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });
        stream.forEach(integer -> System.out.println(integer));
        System.out.println("---------------");

        // 5.排序
        list.stream().sorted().forEach(s -> System.out.println(s));

        // 6.排序（使用比较器）
        list.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        }).forEach(s -> System.out.println(s));
        System.out.println("---------------");

        // 7.合拼流
        List<String> two = new ArrayList<>();
        Collections.addAll(two, "张三", "李四");
        System.out.println("---------------");

        Stream.concat(list.stream(), two.stream()).forEach(s -> System.out.println(s));

        // 8.统计流中的元素的数量
        long count = list.stream().skip(3).count();
        System.out.println("count = " + count);
    }
}
