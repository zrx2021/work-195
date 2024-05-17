package xuan.demo03二分查找;

/*
    定义两个变量，表示要查找的范围。默认left = 0 ， right = 最大索引
    循环查找，正常查找的条件是left <= right
    计算出mid中间索引 = (最小索引+最大索引) / 2
    如果要查找的值小于mid的值，right = mid -1
    如果要查找的值大于mid的值，left = mid + 1
    如果要查找的值等于mid的值，如果是直接返回对应索引
    当 left > right 时，表示要查找的元素在数组中不存在，返回-1
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 22, 30, 40, 50, 60};
        System.out.println("索引所在位置：" + binarySearch(arr, 22));
    }

    /**
     * 二分查找, 前提是数组升序
     * @param arr 要查找的数组
     * @param key 要查找的数字
     * @return 查到的数字在数组的索引
     */
    public static int binarySearch(int[] arr, int key) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // 定义两个变量，表示要查找的范围。默认left = 0 ， right = 最大索引
        int left = 0;
        int right = arr.length - 1;

        // 循环查找，正常查找的条件是left <= right
        while (left <= right) {
            // 计算出mid中间索引 = (最小索引+最大索引) / 2
            int mid = (left + right) / 2;

            // 如果要查找的值小于mid的值，right = mid -1
            if (arr[mid] > key) {
                right = mid - 1;
            } else if (arr[mid] < key) {
                // 如果要查找的值大于mid的值，left = mid + 1
                left = mid + 1;
            } else {
                // 如果要查找的值等于mid的值，如果是直接返回对应索引
                return mid;
            }
        }
        // 当 left > right 时，表示要查找的元素在数组中不存在，返回-1
        return -1;
    }
}
