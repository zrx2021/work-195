package xuan.homework5;

import java.util.Objects;

public class Demo1 {
    public static void main(String[] args) {
        String str1 = "测试";
        String str2 = "测试";
        System.out.println(Objects.equals(str1, str2));
        System.out.println(Objects.nonNull(str1));
        System.out.println(Objects.isNull(str1));
    }
}
