package xuan.demo02选择排序;

import java.util.Arrays;

/*
目标：理解选择排序的原理和实现
    当前元素和后面的每个元素比较

    第一轮: i = 0
            i            j
        arr[0]  和   arr[1]
        arr[0]  和   arr[2]
        arr[0]  和   arr[3]

    第二轮: i = 1
        arr[1]  和   arr[2]
        arr[1]  和   arr[3]

    第三轮: i = 2
        arr[2]  和   arr[3]
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};
        selectionSort(arr);
        System.out.println("排序后: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        // 外循环控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            // System.out.println("轮数i = " + i);
            // 内循环控制每轮比较的内容
            for (int j = i + 1; j < arr.length; j++) {
                // System.out.println("\tj = " + j);
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
