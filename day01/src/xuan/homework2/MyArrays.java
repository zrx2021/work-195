package xuan.homework2;

public class MyArrays {
    private MyArrays() {

    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static String toString(int[] arr) {
        String str = "";
        str += "[";
        for (int i = 0; i < arr.length; i++) {
            str += i == arr.length - 1 ? arr[i] : arr[i] + ", ";
        }
        str += "]";
        return str;
    }
}
