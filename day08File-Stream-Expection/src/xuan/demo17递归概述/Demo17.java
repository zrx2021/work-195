package xuan.demo17递归概述;

/*
目标:学习递归的概念

什么是递归
    方法自己调用自己

递归注意事项
    递归要有出口 (递归要能够停下来)
    递归次数不能太多
 */
public class Demo17 {
    public static void main(String[] args) {
        // test01();
        test02();
    }

    // 直接递归
    public static void test01() {
        System.out.println("-------------test01-------------");
        test01(); // StackOverflowError
    }

    // 间接递归
    public static void test02() {
        System.out.println("-------------test02-------------");
        test03();
    }

    public static void test03() {
        System.out.println("-------------test03-------------");
        test02();
    }
}
