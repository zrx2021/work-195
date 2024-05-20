package xuan.demo11Objects;

import java.util.Objects;

/*
目标: 学习Objects工具类常用方法

public static boolean equals(Object a, Object b): 判断如果a == null 返回false, 如果a != null, 就执行 a.equals(b), 不会出现空指针, 更严谨

Objects类源码
   public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
   }
 */
public class Demo11 {
    public static void main(String[] args) {
        // String s1 = new String("广州黑马");
        String s1 = null;
        String s2 = new String("广州黑马");

        // 如果s1为null，null调用方法出现空指针异常
        // System.out.println(s1.equals(s2));

        System.out.println(Objects.equals(s1, s2));

        // public static boolean isNull(Object obj)：判断参数是否为null，如果参数为null返回true
        System.out.println(Objects.isNull(s1));// true
        System.out.println(Objects.isNull(s2));// false

        // public static boolean nonNull(Object obj)：判断对象是否不为null，如果参数不为null返回true
        System.out.println(Objects.nonNull(s1));// false
        System.out.println(Objects.nonNull(s2));// true
    }
}
