package xuan.demo02collections常用功能;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 1.static <T> boolean addAll(Collection<T> c, T... elements) 将后面的数据放到前面的集合中
        Collections.addAll(list, 11, 22, 33, 44, 55);
        System.out.println("批量添加后：" + list);

        // 2.static void shuffle(List<?> list) 对集合中的元素随机打乱顺序
        Collections.shuffle(list);
        System.out.println("shuffle后list = " + list);

        // 3.static <T> void sort(List<T> list) 使用元素的自然顺序排序
        Collections.sort(list);

        // 4.static <T> void sort(List<T> list, Comparator<? super T> c) 使用比较器排序
        Collections.sort(list, ((o1, o2) -> Integer.compare(o2, o1)));
        System.out.println("sort比较器排序：" + list);
    }
}
