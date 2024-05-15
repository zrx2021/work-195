package com.itheima.test05;

import java.util.Objects;

/*
1.定义两个字符串，使用Objects的equlas()方法，判断内容是否相同
2.定义一个字符串和一个null,使用Objects的equlas()方法，判断内容是否相同
3.定义一个字符串赋值为null,使用Objects的isNull()方法，判断内容是否为空。
4.定义一个字符串赋值为null,使用Objects的nonNull()方法，判断内容是否不为空。
 */
public class Demo05 {
    public static void main(String[] args) {
        //1.定义两个字符串，使用Objects的equlas()方法，判断内容是否相同
        String s1 = "天下无贼";
        String s2 = "头文字D";
        boolean result = Objects.equals(s1, s2);
        System.out.println(result);
        System.out.println("---------------------");
        //2.定义一个字符串和一个null,使用Objects的equlas()方法，判断内容是否相同
        String s3 = "天下无双";
        String s4 = null;
        boolean result2 = Objects.equals(s3, s4);
        System.out.println(result2);
        System.out.println("---------------------");
        //3.定义一个字符串赋值为null,使用Objects的isNull()方法，判断内容是否为空。
        String s5 = null;
        boolean result3 = Objects.isNull(s5);
        System.out.println(result3);
        System.out.println("---------------------");
        //4.定义一个字符串赋值为null,使用Objects的nonNull()方法，判断内容是否不为空。
        String s6 = null;
        boolean result4 = Objects.nonNull(s6);
        System.out.println(result4);
    }
}
