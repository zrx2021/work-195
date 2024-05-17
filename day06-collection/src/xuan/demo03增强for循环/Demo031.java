package xuan.demo03增强for循环;

import java.util.ArrayList;
import java.util.Collection;

/*
    优点：方便
    缺点：没有索引
    细节：增强for修改变量，不会影响集合元素
 */

public class Demo031 {
    public static void main(String[] args) {
        // 1.创建集合
        Collection<String> coll = new ArrayList<>();

        // 2.保存数据
        coll.add("赵敏");
        coll.add("小昭");
        coll.add("素素");
        coll.add("灭绝");

        // 使用增强for遍历集合 (单列集合的最佳遍历方式), 底层是迭代器
        // 增强for快捷键: 数组/集合.for
        for (String s : coll) {
            System.out.println(s);
        }

        System.out.println("---------------");

        int[] arr = {11, 22, 33, 44};
        // 使用增强for遍历数组，底层是普通for循环+数组操作
        for (int i : arr) {
            System.out.println(i);
        }

        // System.out.println("数组改变了吗? " + Arrays.toString(arr));
    }
}
