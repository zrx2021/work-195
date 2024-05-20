package xuan.demo11TreeMap集合;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
目标: 了解TreeMap存储自定义类型作为键
 */
public class Demo11 {
    public static void main(String[] args) {
        // TreeMap<>(): 无参构造, 使用元素的默认排序
        // Map<Teacher, String> map = new TreeMap<>();

        // TreeMap<>(Comparator c): 有参构造, 传入比较器排序
        Map<Teacher, String> map = new TreeMap<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return Double.compare(o2.getSalary(), o1.getSalary());
            }
        });

        Teacher t1 = new Teacher("马云", 60, 1);
        Teacher t2 = new Teacher("马化腾", 50, 2);
        Teacher t3 = new Teacher("马冬梅", 30, 20000);

        map.put(t1, "杭州");
        map.put(t2, "深圳");
        map.put(t3, "西红柿");

        // 遍历map
        map.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
    }
}
