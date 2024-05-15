package xuan.demo1StringJoiner;

import java.util.Arrays;
import java.util.StringJoiner;

/*
    定义方法实现数组内容拼接成字符串,使用StringBuilder拼接字符串
    int[] arr = {11, 22, 33, 44, 55, 66, 77}; 拼接字符串后效果 [11, 22, 33]
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};

        String str = arrayToString(arr);
        System.out.println("str = " + str);

        String str2 = Arrays.toString(arr);
        System.out.println("str2 = " + str2);
    }

    // 是否需要参数? 需要数组 int[] arr
    // 是否需要返回数据? 返回拼接后的字符串 String
    public static String arrayToString(int[] arr) {
        // 对意外情况的判断
        if (arr == null) {
            return "null";
        }

        if (arr.length == 0) {
            return "[]";
        }

        StringJoiner sj = new StringJoiner("，", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(Integer.toString(arr[i]));
        }

        return sj.toString();
    }
}