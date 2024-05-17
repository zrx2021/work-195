package xuan.homework4;

import java.util.Arrays;
import java.util.Random;

/*
目标: 理解冒泡排序的思路
    相邻元素比较
    四个元素比较了三轮

    第一轮: i = 0
            j           j+1
        arr[0]  和   arr[1]
        arr[1]  和   arr[2]
        arr[2]  和   arr[3]

    第二轮: i = 1
        arr[0]  和   arr[1]
        arr[1]  和   arr[2]

    第三轮: i = 2
        arr[0]  和   arr[1]
 */

public class Demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101) + 1;
        }

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
