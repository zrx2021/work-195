package xuan.extendhomework4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        map.put(new Student("马云", 46), "杭州");
        map.put(new Student("马化腾", 46), "深圳");
        map.put(new Student("马冬梅", 46), "北京");
        map.put(new Student("马赛克", 18), "东京");
        map.put(new Student("马赛克", 18), "西安");

        Set<Student> students = map.keySet();

        for (Student student : students) {
            System.out.println(student + map.get(student));
        }
        System.out.println("---------------");

        Set<Map.Entry<Student, String>> entries = map.entrySet();

        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
