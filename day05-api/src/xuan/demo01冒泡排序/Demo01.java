package xuan.demo01冒泡排序;

import xuan.homework4.Demo1;

import java.util.Arrays;

/*
    冒泡排序：每次由最低到最高比较相邻的两个元素比较大小，大的往上走，小的往下走
    每经过一次排序后最大的值已经在最上，遍历的长度减一
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        Demo1.bubbleSort(arr);
    }
}
