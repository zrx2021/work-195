package xuan.homework4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();

        arr.add("JavaEE企业级开发指南");
        arr.add("Oracle高级编程");
        arr.add("MySQL从入门到精通");
        arr.add("Java架构师之路");

        print(arr);
        System.out.println();
        underTenChars(arr);
        System.out.println();
        containJava(arr);
        System.out.println();
        deleteOracle(arr);
    }

    public static void print(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        System.out.println("---所有元素如下---");

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }

    public static void underTenChars(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        System.out.println("---书名小于10个字符的元素---");

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.length() < 10) {
                System.out.println(next);
            }
        }
    }

    private static void containJava(Collection<String> arr) {
        Iterator<String> iterator = arr.iterator();
        System.out.println("---筛选书名中包含“Java”的元素---");

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.contains("Java")) {
                System.out.println(next);
            }
        }
    }

    private static void deleteOracle(Collection<String> arr) {
        Iterator<String> iterator = arr.iterator();
        System.out.println("---删除书名中包含“Oracle”的元素---");

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.contains("Oracle")) {
                iterator.remove();
            }
        }

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
