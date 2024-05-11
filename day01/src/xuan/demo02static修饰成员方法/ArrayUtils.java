package xuan.demo02static修饰成员方法;

public class ArrayUtils {
    // 工具类的构造器私有，不让别人创建对象
    private ArrayUtils() {}

    /**
     * 求一个int数组的总和
     * @param arr int数组
     * @return 数组元素的总和
     */
    public static int getArraySum(int[] arr) {
        // 1.定义变量保存总和
        int sum = 0;

        // 2.遍历数组获取每个元素
        for (int i = 0; i < arr.length; i++) {
            // 3.求总和
            sum += arr[i];
        }

        // 4.返回总和
        return sum;
    }
}
