package xuan.demo12包装类;

import java.util.ArrayList;

/*
目标:学习String和int之间互相转换
 */
public class Demo12 {
    public static void main(String[] args) {
        // int转成String  5 -> "5"
        String s1 = 5 + ""; // "5"
        String s2 = Integer.toString(5); // "5"

        // String转成int "5" -> 5  重点     注意:  字符串中的内容一定能够转成数字, 否则失败
        int i = Integer.parseInt("5"); // "5" -> 5

        // 扩展: String转成double
        double d = Double.parseDouble("135.90"); // "135.90" -> 135.9
        // System.out.println("d = " + d);

        // 自动装箱: 把 基本类型 自动转成 对应的 包装类类型 int -> Integer
        Integer i2 = 5; // 底层  Integer i2 = Integer.valueOf(5);

        // 自动拆箱: 把 包装类类型 自动转成 对应的 基本类型
        int i3 = i2; // 底层 int i3 = i2.intVlaue();

        // 自动装箱和拆箱的应用场景, 自动装箱和拆箱简化代码
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11); // 自动装箱
        int i4 = list.get(0); // 自动拆箱
    }
}
