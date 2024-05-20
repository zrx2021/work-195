package xuan.demo01体验Stream流;

import java.util.ArrayList;
import java.util.Collections;

/*
目标：体验集合操作数据的弊端

讲解：
    一个ArrayList集合中存储有以下数据:张无忌,周芷若,赵敏,张强,张三丰
    需求:1.拿到所有姓张的 2.拿到名字长度为3个字的 3.打印这些数据

小结:
    使用集合直接操作数据,每个操作都需要创建新集合,还要遍历老集合.麻烦,繁琐
 */
public class Demo01 {
    public static void main(String[] args) {
        // 一个ArrayList集合中存储有以下数据:张无忌,周芷若,赵敏,张强,张三丰
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        // 1.拿到所有姓张的
        ArrayList<String> zhangList = new ArrayList<>(); // "张无忌", "张强", "张三丰"
        for (String name : list) {
            if (name.startsWith("张")) {
                zhangList.add(name);
            }
        }

        // 2.拿到名字长度为3个字的
        ArrayList<String> zhangSanList = new ArrayList<>(); // "张无忌", "张三丰"
        for (String name : zhangList) {
            if (name.length() == 3) {
                zhangSanList.add(name);
            }
        }

        // 3.打印这些数据
        for (String name : zhangSanList) {
            System.out.println(name);
        }
        System.out.println("--------------------");

        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));
    }
}
