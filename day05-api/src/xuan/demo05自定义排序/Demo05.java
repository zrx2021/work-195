package xuan.demo05自定义排序;

import java.util.Arrays;
import java.util.Comparator;

public class Demo05 {
    public static void main(String[] args) {
        Student[] stu = new Student[4];
        stu[0] = new Student("迪丽热巴", 28, 1.77);
        stu[1] = new Student("古丽娜扎", 18, 1.87);
        stu[2] = new Student("马尔扎哈", 22, 1.67);
        stu[3] = new Student("摩托摩拉", 33, 1.47);

        // 数组排序（使用元素的规则排序，自然排序）
        // Arrays.sort(stu);

        // Comparator<? super T> c比较器接口：通过比较器指定元素的比较器
        // 注意：如果元素实现了Comparable接口和sort指定了Comparator比较器，比较器的优先级高
        // 原版：
        // Arrays.sort(stu, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         // o1左边 和 o2 右边
        //         // return Integer.compare(o1.getAge(), o2.getAge());
        //         // return Double.compare(o1.getHeight(), o2.getHeight());// 升序
        //         return Double.compare(o2.getHeight(), o1.getHeight());// 降序
        //     }
        // });

        // Lambda表达式：
        Arrays.sort(stu, (Student o1, Student o2) -> {
            return Double.compare(o1.getHeight(), o2.getHeight());
        });

        // Lambda再简化：
        Arrays.sort(stu, (o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));

        Arrays.sort(stu, Student::compareTo);

        System.out.println("排序后：" + Arrays.toString(stu));
    }
}
