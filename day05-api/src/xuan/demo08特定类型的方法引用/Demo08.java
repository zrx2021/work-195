package xuan.demo08特定类型的方法引用;

import java.util.Arrays;
import java.util.Comparator;

/*
目标: 学习特定类型的方法引用
    格式: 类型::普通方法

    使用场景
        如果某个Lambda表达式里只是调用一个普通方法，并且第一个参数是作为方法的调用者，
        后面的所有参数都是作为该普通方法的入参的，则此时就可以使用特定类型的方法引用
 */
public class Demo08 {
    public static void main(String[] args) {
        // 需求: 按照名字的首字母编号进行排序。忽略大小写比较
        String[] names = new String[] {"baby", "Angela", "about", "eson", "Jack", "jack2", "rose"};
        // 匿名内部类
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        // Lambda表达式
        Arrays.sort(names, (String o1, String o2) -> {
            return o1.compareToIgnoreCase(o2);
        });

        // 方法引用
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println("排序后: " + Arrays.toString(names));
    }
}
