package xuan.demo11Objects;

import java.util.Objects;

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
