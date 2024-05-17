package xuan.demo06ArrayList集合;


import java.util.ArrayList;

/*
目标:了解ArrayList的原理
    ArrayList集合的底层结构是数组
        查询快,增删慢
 */
public class Demo06 {
    public static void main(String[] args) {
        // 直接使用ArrayList.探索ArrayList底层原理
        // 看源码: ctrl + 鼠标左键         SHIFT + F7: 进入Java的源码
        ArrayList<String> list1 = new ArrayList<>();// 首先创建长度为0的Object数组
        list1.add("a1");// 创建长度为10的数组，并把旧数组赋值到这个新创建的数组
        list1.add("a2");
        list1.add("a3");
        list1.add("a4");
        list1.add("a5");
        list1.add("a6");
        list1.add("a7");
        list1.add("a8");
        list1.add("a9");
        list1.add("a10");
        list1.add("a11");// 达到最大，扩容1.5倍
    }
}
