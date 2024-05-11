package xuan.demo02static修饰成员方法;

// 1.定义一个工具类, 提供静态方法方法求一个int数组的总和，并且返回总和
public class HomeWork1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{10, 20, 30, 40, 50};
        int[] arr2 = new int[]{10, 20, 30, 40, 50, 60, 70};

        System.out.println(ArrayUtils.getArraySum(arr1));
        System.out.println(ArrayUtils.getArraySum(arr2));
    }
}
