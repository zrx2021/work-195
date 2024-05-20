package xuan.demo03Stream流常用方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
filter方法作用
    过滤,得到符合要求的数据,过滤掉不符合要求的数据

foreach方法的作用
    遍历流中的数据

    Stream流注意事项:
        1.不调用终结方法, 中间操作不会执行
        2.一个流只能调用一次
 */
public class Demo031 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        Collections.addAll(one, "迪丽热巴", "宋远桥", "宋远桥", "苏星河", "老子", "老子", "庄子", "孙子", "孙子");

        // // 1.获取Stream流
        // Stream<String> stream1 = one.stream();
        //
        // // 2.调用中间方法操作数据, 返回新的流
        // Stream<String> stream2 = stream1.filter(new Predicate<String>() {
        //     @Override
        //     public boolean test(String s) {
        //         System.out.println("中间操作: " + s);
        //         return s.length() == 3;
        //     }
        // });
        // System.out.println("stream1 = " + stream1);
        // System.out.println("stream2 = " + stream2);
        //
        // // 3.调用终结方法结束流
        // stream2.forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String s) {
        //         System.out.println(s);
        //     }
        // });

        // 链式编程
        // one.stream().filter(new Predicate<String>() {
        //     @Override
        //     public boolean test(String s) {
        //         return s.length() == 3;
        //     }
        // }).forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String s) {
        //         System.out.println(s);
        //     }
        // });

        // Lambda表达式
        // 要记住filter方法中的Lambda和forEach的Lambda
        // Lambda的参数s就是元素
        one.stream().filter(s -> {
            return s.length() == 3;
        }).forEach(s -> {
            System.out.println(s);
        });
    }
}
