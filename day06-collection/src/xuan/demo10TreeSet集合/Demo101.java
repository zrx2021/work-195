package xuan.demo10TreeSet集合;

import java.util.Set;
import java.util.TreeSet;

public class Demo101 {
    public static void main(String[] args) {
        // 如果没有比较器，抛出：Exception in thread "main" java.lang.ClassCastException: class xuan.demo10TreeSet集合.Student cannot be cast to class java.lang.Comparable
        Set<Student> treeSet = new TreeSet<>(((o1, o2) -> {
            int compareScore = Double.compare(o1.getScore(), o2.getScore());
            if (compareScore == 0) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
            return compareScore;
        }));

        // 由上往下加入treeSet，如果成绩相同则比较年龄，C学生由于成绩和年龄与A相同所以无法加入
        treeSet.add(new Student("A学生", 18, 90));
        treeSet.add(new Student("B学生", 17, 90));
        treeSet.add(new Student("C学生", 18, 90));
        treeSet.add(new Student("D学生", 19, 90));

        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}
