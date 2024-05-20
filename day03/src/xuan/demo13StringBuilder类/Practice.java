package xuan.demo13StringBuilder类;

/*
    定义方法实现数组内容拼接成字符串,使用StringBuilder拼接字符串
    int[] arr = {11, 22, 33, 44, 55, 66, 77}; 拼接字符串后效果 [11, 22, 33]
 */
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
