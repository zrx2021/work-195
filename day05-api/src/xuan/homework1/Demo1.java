package xuan.homework1;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr1 = {11, 55, 33, 44, 66, 88, 77};
        int[] arr2 = Arrays.copyOfRange(arr1, 1, 6);
        System.out.println(Arrays.toString(arr2));
    }
}
