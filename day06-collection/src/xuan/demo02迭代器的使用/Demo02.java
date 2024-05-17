package xuan.demo02迭代器的使用;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        // 1.创建集合
        Collection<String> coll = new ArrayList<>();

        // 2.保存数据
        coll.add("赵敏");
        coll.add("小昭");
        coll.add("素素");
        coll.add("灭绝");

        // 3.使用迭代器获取集合的数据
        // Iterator<String> itr = coll.iterator();
        // System.out.println(itr.next()); // 赵敏
        // System.out.println(itr.next()); // 小昭
        // System.out.println(itr.next()); // 素素
        // System.out.println(itr.next()); // 灭绝
        // System.out.println(itr.next()); // NoSuchElementException: 找不到元素
        // 以上代码是重复代码, 如果没有元素会出现异常, 改成循环来处理

        // 3.1.获取集合的迭代器
        Iterator<String> iterator = coll.iterator();
        // 3.2.循环判断是否有元素
        while (iterator.hasNext()) {
            // 3.3.有元素就获取
            String next = iterator.next();
            System.out.println("next = " + next);
        }
    }
}
