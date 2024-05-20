package xuan.demo10HashMap存储自定义类型作为键;

import java.util.HashMap;
import java.util.Map;

/*
注意: 自定义类型作为HashMap的键, 需要重写hashCode和equals方法, 去除重复
 */
public class Demo10 {
    public static void main(String[] args) {
        // 创建HashMap集合
        Map<Student, String> map = new HashMap<>();

        // 创建3个学生
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 28);
        Student s3 = new Student("王五", 26);
        Student s4 = new Student("王五", 26);

        // 把学生保存到HashMap集合中
        map.put(s1, "广州");
        map.put(s2, "东莞");
        map.put(s3, "佛山");
        map.put(s4, "清远");

        // 遍历HashMap集合
        map.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
    }
}
