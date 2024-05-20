package xuan.demo10Object类的toString方法;

import java.util.ArrayList;

/*
    目标: 学习Object类的toString方法

    Object类的toString方法默认返回: 包名.类名@对象地址,
    子类觉得这个方法不满足自己的要求, 子类可以重写toString()方法, 返回对象的属性(成员变量)

    快捷键生成toString(): 右键 -> Generate -> toString()
 */
public class toString方法 {
    public static void main(String[] args) {
        Student student = new Student("张三", 18);

        System.out.println(student);

        String str = new String("aaa");
        System.out.println(str);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        System.out.println(list);

        int[] arr = {11, 22, 33, 44};
        System.out.println(arr);
    }
}
