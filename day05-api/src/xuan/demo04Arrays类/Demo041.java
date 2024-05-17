package xuan.demo04Arrays类;

import java.util.Arrays;

public class Demo041 {
    public static void main(String[] args) {
        int[] arr = {22, 66, 11, 33, 55};

        System.out.println("数组内容：" + Arrays.toString(arr));

        // 包前不包后
        int[] newArray = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("copyOfRange = " + Arrays.toString(newArray));

        // 从0索引开始拷贝
        int[] newArray2 = Arrays.copyOf(arr, 3);// [22, 66, 11]
        System.out.println("copyOf = " + Arrays.toString(newArray2));

        // 匿名内部类
        // Arrays.setAll(arr, new IntUnaryOperator() {
        //     @Override
        //     public int applyAsInt(int operand) {
        //         System.out.println("索引 operand：" + operand);
        //         return arr[operand] + 10;
        //     }
        // });

        // Lambda表达式简化匿名内部类：
        // Arrays.setAll(arr, (operand) -> {
        //     return arr[operand] + 10;
        // });

        // Lambda表达式再简化：
        Arrays.setAll(arr, operand -> arr[operand] + 10);

        System.out.println("setAll：" + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 77);
        // 找不到返回索引：-(low + 1)
        System.out.println("index = " + index);
    }
}
