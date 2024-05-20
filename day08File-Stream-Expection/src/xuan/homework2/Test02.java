package xuan.homework2;

import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        // 1.使用String[]存储题目中的数据
        String[] words = new String[] {
                    "love", "happiness", "family", "friendship","LOVE", "laughter", "Joy",
                    "celebration", "Birth", "marriage", "CHILDREN", "parents", "siblings"};

        // 2.使用Stream的filter方法过滤出所有长度小于8的字符串
        // 3.使用Stream的map方法将所有字符串转换为小写
        // 4.使用Stream的distinct方法去除所有重复的字符串
        // 5.使用Stream的sorted方法对剩余的字符串按照字母顺序自然排序排列
        // 6.使用Stream的skip方法跳过前2个
        // 6.使用Stream的limit取出5个
        // 7.使用Stream的forEach方法打印出所有字符串
        Stream.of(words)
                .filter(s -> s.length() < 8)
                .map(s -> s.toLowerCase())
                .distinct()
                .sorted()
                .skip(2)
                .limit(5)
                .forEach(System.out::println);
    }
}