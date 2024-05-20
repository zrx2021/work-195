package xuan.demo2获取Stream流;

import java.util.*;
import java.util.stream.Stream;

/*
目标:掌握Stream流的获取
 */
public class Demo02 {
    public static void main(String[] args) {
        // 1.Collection接口中有一个默认方法: Stream stream(); 集合得到流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        // 2.Map如何获取流? Map不能直接获取流, 获取键再获取流
        Map<String, String> map = new HashMap<>();
        Stream<String> stream3 = map.keySet().stream();
        Stream<Map.Entry<String, String>> stream4 = map.entrySet().stream();

        // 3.Arrays类的public static <T> Stream<T> stream(T[] array) 数组得到流
        String[] names = {"张三", "李四", "王五"};
        Stream<String> stream5 = Arrays.stream(names);

        // 4.Stream接口的public static<T> Stream<T> of(T... values) 零散数据得到流
        Stream<String> stream6 = Stream.of("aa", "bb");
        Stream<Integer> stream7 = Stream.of(11, 22, 33);
    }
}
