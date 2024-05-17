package xuan.demo05自定义排序;

import java.util.Arrays;
import java.util.Comparator;

/*
   创建一个Teacher老师类,包含 姓名, 年龄, 工资
   创建一个长度为4的数组，存放4个老师对象
   实现默认按照年龄排序升序，
   实现比较器按照工资降序
*/
public class Practice {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[4];
        teachers[0] = new Teacher("老师一号", 22, 2000.0);
        teachers[1] = new Teacher("老师二号", 23, 1000.0);
        teachers[2] = new Teacher("老师三号", 22, 4000.0);
        teachers[3] = new Teacher("老师四号", 24, 3000.0);

        // 按照元素的默认规则排序
        Arrays.sort(teachers);

        System.out.println("默认规则排序后：" + Arrays.toString(teachers));

        Arrays.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return Double.compare(o2.getSalary(), o1.getSalary());
            }
        });

        System.out.println("按照比较器排序：" + Arrays.toString(teachers));
    }
}
