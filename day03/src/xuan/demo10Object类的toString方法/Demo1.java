package xuan.demo10Object类的toString方法;

import java.util.ArrayList;

public class Demo1 {
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
