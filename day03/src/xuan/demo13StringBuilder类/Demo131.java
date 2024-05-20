package xuan.demo13StringBuilder类;

/*
目标：掌握StringBuilder的使用，对字符串进行操作
    String         字符串，内容不可以改变
    StringBuilder  字符串容器, 内容可以改变，线程不安全的，效率高  单线程使用没有问题
    StringBuffer   字符串容器, 内容可以改变，线程安全，效率低
 */
public class Demo131 {
    public static void main(String[] args) {
        // 1.创建StringBuilder
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder("abc");
        System.out.println("sb = " + sb);

        // 2.public StringBuilder append(任意类型的数据): 添加内容到StringBuilder中
        // sb.append(123);
        // sb.append('好');
        // sb.append(6.66);
        // sb.append("很好");
        // 3.链式编程: 返回值类型是本身类型, 使用链式编程
        sb.append(123).append('好').append(6.66).append("很好");
        System.out.println("sb2 = " + sb);

        // 4.public StringBuilder reverse(): 反转StringBuilder中的内容
        sb.reverse();
        System.out.println("反转后sb3" + sb);

        System.out.println("长度：" + sb.length());

        // 6.public String toString(): 把StringBuilder转化为字符串
        String str = sb.toString();
        System.out.println("str = " + str);
    }
}
