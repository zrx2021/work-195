package xuan.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        System.out.println("\n第一种遍历方式：增强for循环遍历 List 集合");
        for (String item : items) {
            System.out.println(item);
        }

        items.forEach((String s) -> System.out.println(s));
    }
}
