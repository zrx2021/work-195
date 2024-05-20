package xuan.homework2;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        String[] words = new String[]{"love", "happiness", "family", "friendship", "LOVE", "laughter", "Joy", "celebration", "Birth", "marriage", "CHILDREN", "parents", "siblings"};

        System.out.println("过滤出所有长度小于`8`的字符串。");
        Arrays.stream(words).filter(s -> s.length() < 8).forEach(System.out::println);

        System.out.println("将所有字符串转换为小写");
        Arrays.stream(words).map(String::toLowerCase).forEach(System.out::println);

        System.out.println("去除所有重复的字符串。");
        Arrays.stream(words).distinct().forEach(System.out::println);

        System.out.println("对剩余的字符串按照字母顺序自然排序排列。");
        Arrays.stream(words).sorted().forEach(System.out::println);

        System.out.println("跳过前2个，取出5个");
        Arrays.stream(words).skip(2).limit(5).forEach(System.out::println);
    }
}
