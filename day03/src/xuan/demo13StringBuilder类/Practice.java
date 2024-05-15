package xuan.demo13StringBuilder类;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        System.out.println(getAppend(arr));
    }

    public static String getAppend(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append(", ");
        }

        sb.append(arr[arr.length - 1]).append("]");
        return sb.toString();
    }
}
