package xuan.demo05List集合;

import java.util.ArrayList;
import java.util.List;

/*
目标:掌握List系列集合特有的方法
    特点: 有序，可重复，有索引
    多了索引，所以多了很多与索引相关的特有方法
 */
public class Demo05 {
    public static void main(String[] args) {
        // 多态:  接口 变量名 = new 实现类();
        // 多态情况下, 使用的是接口中定义的方法
        List<String> list = new ArrayList<>();
        list.add("灭绝师太");
        list.add("灭绝师太");
        list.add("金毛狮王");
        list.add("周芷若");
        list.add("周芷若");

        System.out.println("list = " + list); // [灭绝师太, 灭绝师太, 金毛狮王, 周芷若, 周芷若]

        // 1.void add(int index,E element)   往某个索引位置处插入一个数据
        list.add(0, "张无忌");
        System.out.println("添加后 list = " + list); // [张无忌, 灭绝师太, 灭绝师太, 金毛狮王, 周芷若, 周芷若]

        // 2.E remove(int index) 删除指定索引处的元素，返回被删除的元素
        list.remove(1);
        System.out.println("删除后 list = " + list); // [张无忌, 灭绝师太, 金毛狮王, 周芷若, 周芷若]

        // 3.E set(int index,E element)  修改指定索引处的元素，返回被修改的元素
        list.set(3, "周振");
        System.out.println("修改后 list = " + list); // [张无忌, 灭绝师太, 金毛狮王, 周振, 周芷若]

        // 4.E get(int index)    返回指定索引处的元素
        System.out.println(list.get(0)); // 张无忌
        System.out.println(list.get(3)); // 周振
    }
}
