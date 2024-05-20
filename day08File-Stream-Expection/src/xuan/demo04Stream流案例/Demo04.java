package xuan.demo04Stream流案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
需求：
    现在有两个ArrayList集合，分别存储男演员和女演员，要求完成如下的操作
    1.男演员只要名字为3个字的前两人
    2.女演员只要姓杨的，并且不要第一个
    3.把过滤后的男演员姓名和女演员姓名合并到一起
    4.遍历所有数据
*/
public class Demo04 {
    public static void main(String[] args) {
        // 男演员
        List<String> man = new ArrayList<>();
        Collections.addAll(man, "迪丽热巴", "宋远桥", "苏星河", "老子", "庄子", "孙子", "洪七公", "乔大峰", "欧阳锋");

        // 女演员
        List<String> women = new ArrayList<>();
        Collections.addAll(women, "杨颖", "杨洋", "张三丰", "赵丽颖", "张二狗", "杨超越");

        System.out.println("男演员只要名字为3个字的前两人：");
        Stream<String> stream1 = man.stream().filter(s -> s.length() == 3).limit(2);

        System.out.println("女演员只要姓杨的，并且不要第一个：");
        Stream<String> stream2 = women.stream().filter(s -> s.startsWith("杨")).skip(1);

        // 3.把过滤后的男演员姓名和女演员姓名合并到一起
        // 4.遍历所有数据
        // Stream.concat(stream1, stream2).forEach(s -> System.out.println(s));
        Stream.concat(stream1, stream2).forEach(System.out::println);
    }
}
