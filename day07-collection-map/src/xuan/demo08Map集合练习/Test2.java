package xuan.demo08Map集合练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<Student, String> stus = new HashMap<>();

        stus.put(new Student("张三", 18), "广东");
        stus.put(new Student("张三", 18), "广东");
        stus.put(new Student("李四", 19), "广东");
        stus.put(new Student("李四", 18), "广东");
        stus.put(new Student("赵五", 18), "广东");
        stus.put(new Student("王六", 18), "广东");

        Set<Map.Entry<Student, String>> set = stus.entrySet();
        for (Map.Entry<Student, String> studentStringEntry : set) {
            Student key = studentStringEntry.getKey();
            String value = studentStringEntry.getValue();
            System.out.println("学生：" + key + " == " + "籍贯：" + value);
        }
    }
}
