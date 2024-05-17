package xuan.demo05泛型介绍;

import java.util.ArrayList;

/*
目标: 了解泛型的概念和作用

泛型的概念: 变化的类型
泛型格式: <泛型名>     类似于变量名
泛型的作用: 使用时可以传入不同的类型赋值给泛型变量, 让类型可以变化, 减少重复代码
 */
public class Demo05 {
    public static void main(String[] args) {
        // 注意事项1: 泛型是在编译前帮我们限定类型, 编译后泛型就没有啦, 泛型擦除
        ArrayList<String> list1 = new ArrayList<>();
        // add(String e)
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");
        String s = list1.get(0);

        ArrayList<Integer> list2 = new ArrayList<>();
        // add(Integer e)
        list2.add(11);
        list2.add(22);
        list2.add(33);
        Integer i = list2.get(0);

        // 注意事项2: 泛型只能是引用类型
        // ArrayList<int> list3 = new ArrayList<int>();
        // ArrayList<double> list4 = new ArrayList<double>();

        // 注意事项3: 不指定泛型的类型, 会看做Object类型
        ArrayList list5 = new ArrayList<>();
        // list5.add(Object e)
        // Object o = list5.get(0);

    }
}
