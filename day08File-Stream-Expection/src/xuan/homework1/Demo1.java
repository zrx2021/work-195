package xuan.homework1;

import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");

        names.filter(s -> s.startsWith("郭")).limit(2).forEach(System.out::println);

    }
}
