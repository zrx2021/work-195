package xuan.demo08Set集合特点;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
目标：认识Set系列集合的特点
    1.存储和取出没有顺序
    2.元素不可重复
    3.没有索引

    注意:没有get方法和set方法
 */
public class Demo08 {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>(); // 存储和取出没有顺序,元素不可重复,没有索引
        Set<Integer> set = new LinkedHashSet<>(); // 存储和取出有顺序,元素不可重复,没有索引
        // Set<Integer> set = new TreeSet<>(); // 一定要排序,元素不可重复,没有索引
        set.add(24);
        set.add(18);
        set.add(35);
        set.add(35);
        set.add(17);
        set.add(6);

        System.out.println("set = " + set);
    }
}
