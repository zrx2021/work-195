package xuan.demo11正则表达式规则;

/*
目标:正则表达式-分组括号
    (): 会将()里面的内容作为一组
 */
public class Demo074 {
    public static void main(String[] args) {
        System.out.println("-------------------- (): 会将()里面的内容作为一组 -----------------------------------");
        System.out.println("alibaba".matches("ali(ba){2}")); // true
        System.out.println("alibababa".matches("ali(ba){2,}")); // true
        System.out.println("-------------------必须是”我爱“开头，中间可以是至少一个”编程“，最后至少是1个”666“---------------------------------");
        System.out.println("我爱编程编程666666".matches("我爱(编程)+(666)+")); // true
        System.out.println("我爱编编程编程666666".matches("我爱(编程)+(666)+")); // false
        System.out.println("我爱编程编程编程编程编程666666666".matches("我爱(编程)+(666)+")); // true

        System.out.println("-------------------- 其他几个常用的符号：(?i)忽略大小写 、 -----------------------------------");
        // 4.其他几个常用的符号：(?i)忽略大小写 、 或：| 、  分组：()
        System.out.println("abc".matches("(?i)abc")); // true
        System.out.println("ABC".matches("(?i)abc")); // true
        System.out.println("AB2".matches("(?i)abc")); // false
        System.out.println("-----------");

        System.out.println("aBc".matches("a((?i)b)c")); // true
        System.out.println("aXc".matches("a((?i)b)c")); // false

        System.out.println("-------------------|：或 3个小写字母 或 3个数字。------------------------------------");
        System.out.println("123".matches("[a-z]{3}|\\d{3}")); // true
        System.out.println("abc".matches("[a-z]{3}|\\d{3}")); // true
        System.out.println("ab2".matches("[a-z]{3}|\\d{3}")); // false
    }
}
