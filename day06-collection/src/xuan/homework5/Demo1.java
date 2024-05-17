package xuan.homework5;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {
        Collection<Double> coll = new ArrayList<>();

        coll.add(88.5);
        coll.add(39.2);
        coll.add(77.1);
        coll.add(56.8);
        coll.add(89.0);
        coll.add(99.0);
        coll.add(59.5);

        System.out.println("使用增强for遍历所有元素，并打印如下:");
        for (Double v : coll) {
            System.out.println(v);
        }

        System.out.println("使用增强for遍历所有元素，打印不及格的分数如下:");
        for (Double v : coll) {
            if (v < 60) {
                System.out.println(v);
            }
        }

        int count = 0;
        double sum = 0.0;
        System.out.println("使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果");
        for (Double v : coll) {
            if (v < 60) {
                count++;
                sum += v;
            }
        }

        System.out.println("不及格的分数有:" + count + "个,不及格的人平均分是:" + sum / count);
    }
}
