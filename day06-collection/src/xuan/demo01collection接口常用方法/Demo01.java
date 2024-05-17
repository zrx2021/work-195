package xuan.demo01collection接口常用方法;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
    public static void main(String[] args) {
        // 0.创建集合
        // 多态： 接口 变量名 = new 实现类();
        // 左边写接口的原因，因为现在学习的方法都Collection接口中定义的方法
        Collection<String> coll = new ArrayList<>();

        // 1.public boolean add(E e): 添加元素到当前集合中
        coll.add("Java");
        coll.add("Java");
        coll.add("数据库");
        coll.add("HTML");
        coll.add("CSS");
        System.out.println("add后coll = " + coll);

        // 2.public void clear(): 清空集合中所有的元素
        // coll.clear();
        // System.out.println("清除后coll = " + coll);

        // 3.public boolean isEmpty(): 判断当前集合是否为空
        System.out.println("isEmpty：" + coll.isEmpty());

        // 4.public int size(): 返回集合中元素的个数
        System.out.println("元素的个数：" + coll.size());

        // 5.public boolean contains(Object obj): 判断当前集合中是否包含给定的对象
        System.out.println("是否包含数据库" + coll.contains("数据库"));
        System.out.println("是否包含数据库" + coll.contains("PHP"));

        // 6.public boolean remove(E e): 把给定的对象在当前集合中删除
        boolean b = coll.remove("HTML");
        System.out.println("是否删除b：" + b);
        System.out.println("删除HTML coll = " + coll);

        // 7.public Object[] toArray(): 把集合中的元素，存储到数组中
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
