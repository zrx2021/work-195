package xuan.demo00并发修改异常;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
目标:了解迭代器并发修改异常

    迭代器的目的是什么?获取数据
    在迭代的过程中去往集合添加或删除数据(有问题)
    集合中存储王二麻子,张三,张三丰,李四,王五,赵六这六个数据,删除姓张的
 */
public class Demo00 {
    public static void main(String[] args) {
        // Collection<String> coll = new ArrayList<>();
        List<String> coll = new ArrayList<>();

        coll.add("王二麻子");
        coll.add("张三");
        coll.add("张三丰");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");

        // 问题是迭代器在迭代获取元素, 集合再删除元素可能导致数据冲突
        // 问题原因: 迭代器遍历, 集合删除
        // Iterator<String> itr = coll.iterator();
        // while (itr.hasNext()) {
        //     String name = itr.next(); // ConcurrentModificationException: 并发修改异常
        //     System.out.println("name = " + name);
        //
        //     // 删除数据
        //     if (name.startsWith("张")) {
        //         coll.remove(name);
        //     }
        // }

        // 问题原因: 迭代器遍历, 集合删除
        // for (String name : coll) {
        //     System.out.println("name = " + name);
        //
        //     // 删除数据
        //     if (name.startsWith("张")) {
        //         coll.remove(name);
        //     }
        // }

        // 解决方案1: 使用迭代器遍历,迭代器删除
        // Iterator<String> itr = coll.iterator();
        // while (itr.hasNext()) {
        //     String name = itr.next(); // ConcurrentModificationException: 并发修改异常
        //     System.out.println("name = " + name);
        //
        //     // 删除数据
        //     if (name.startsWith("张")) {
        //         itr.remove();
        //     }
        // }

        // 解决方案2: 使用集合遍历,集合删除
        // for (int i = 0; i < coll.size(); i++) {
        //     String name = coll.get(i);
        //     System.out.println("name = " + name);
        //     if (name.startsWith("张")) {
        //         coll.remove(i);
        //         i--;
        //     }
        // }

        System.out.println("coll = " + coll);
    }
}
