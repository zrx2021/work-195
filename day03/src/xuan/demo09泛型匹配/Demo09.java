package xuan.demo09泛型匹配;

import java.util.ArrayList;

/*
目标: 学习泛型匹配

            Object
            /    \
       Student  Worker
          |
      JavaStudent

泛型匹配, 泛型不存在多态
?: 泛型可以匹配任意类型
? extends Student: 泛型可以匹配Student及其子类
? super Student: 泛型可以匹配Student及其父类

alt + 鼠标左键拖动: 多行编辑
 */
public class Demo09 {
    public static void main(String[] args) {
        // 多态: 父类 变量名 = new 子类();
        Object obj = new Student();

        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Student> list2 = new ArrayList<>();
        ArrayList<JavaStudent> list3 = new ArrayList<>();
        ArrayList<Worker> list4 = new ArrayList<>();

        printArrayList1(list1);
        printArrayList1(list2);
        printArrayList1(list3);
        printArrayList1(list4);

        // printArrayList2(list1);
        printArrayList2(list2);
        printArrayList2(list3);
        // printArrayList2(list4);

        printArrayList3(list1);
        printArrayList3(list2);
        // printArrayList3(list3);
        // printArrayList3(list4);
    }

    // 打印ArrayList,可以传入ArrayList,集合的泛型类型Student或父类  ? super Student: 泛型可以匹配Student及其父类
    public static void printArrayList3(ArrayList<? super Student> list) {
        System.out.println(list);
    }

    // 打印ArrayList,可以传入ArrayList,集合的泛型类型Student或子类  ? extends Student: 泛型可以匹配Student及其子类
    public static void printArrayList2(ArrayList<? extends Student> list) {
        System.out.println(list);
    }

    // 打印ArrayList,可以传入ArrayList,集合的泛型类型任意,  注意泛型在匹配的时候一定要一样  ?: 泛型可以匹配任意类型
    public static void printArrayList1(ArrayList<?> list) {
        System.out.println(list);
    }
}
