package xuan.demo04Arrays类;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntUnaryOperator;

/*
目标: 能够说出Arrays的作用,
     用来操作数组的一个工具类
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {22, 66, 11, 33, 55};
        //      索引  0   1   2   3   4

        // 1.public static String toString(类型[] arr): 返回数组的内容
        System.out.println("数组内容: " + Arrays.toString(arr)); // [22, 66, 11, 33, 55]

        // 2.public static int[] copyOfRange(类型[] arr, 起始索引, 结束索引): 拷贝指定范围的数组,不包含结束索引
        int[] newArray = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("copyOfRange: " + Arrays.toString(newArray)); // [11, 33]

        // 3.public static copyOf(类型[] arr, int newLength): 拷贝指定长度数组, 从0索引开始复制
        int[] newArray2 = Arrays.copyOf(arr, 3); // [22, 66, 11]
        System.out.println("copyOf: " + Arrays.toString(newArray2));

        // 4.public static void setAll(int[] array, IntUnaryOperator generator): 把数组中的全部原数据改为新数据
        Arrays.setAll(arr, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                // System.out.println("索引 operand = " + operand);
                // 把数组原始内容 +10
                return arr[operand] + 10; // 数组的新内容
            }
        });
        System.out.println("setAll: " + Arrays.toString(arr));

        // 5.public static void sort(类型[] arr): 对数组进行排序(默认是升序排序)
        Arrays.sort(arr);

        System.out.println("排序后: " + Arrays.toString(arr)); // [21, 32, 43, 65, 76]

        // 6.public static int binarySearch(类型[] a, int key): 从数组中查询某个元素的位置
        int index = Arrays.binarySearch(arr, 77);
        System.out.println("index = " + index);

        Integer[] arr2 = {22, 66, 11, 33, 55};

        // 匿名内部类
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });

        // Lambda表达式
        Arrays.sort(arr2, (Integer o1, Integer o2) -> {
            return Integer.compare(o1, o2);
        });

        // Lambda表达式简化写法
        Arrays.sort(arr2, (o1, o2) -> Integer.compare(o1, o2));

        // 方法引用
        Arrays.sort(arr2, Integer::compare);
        // 光标放在 匿名内部类的接口名上, alt + 回车, Replace with method refreence
        Arrays.sort(arr2, Integer::compare);
    }
}
