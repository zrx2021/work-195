package xuan.demo11正则表达式规则;

/*
目标:正则表达式-预定义字符
 */
public class Demo072 {
    public static void main(String[] args) {
        System.out.println("------------------ .代表所有的字符 -------------------------------------");
        // 正则表达式-预定义字符
        // 1."." ： 匹配任何一个字符。
        System.out.println("我想你".matches("我.你")); // true
        System.out.println("我打你".matches("我.你")); // true
        System.out.println("我看你".matches("我.你")); // true
        System.out.println("abc".matches("...")); // true

        // System.out.println("192和168".matches("192.168")); // true
        // \. 让.没有特殊含义,只能匹配普通的.
        System.out.println("192.168".matches("192\\.168")); // true
        System.out.println("192a168".matches("192.168")); // true
        System.out.println("192a168".matches("192\\.168")); // false

        System.out.println("------------------ \\d 预定义字符[0-9]代表数字 -------------------------------------");
        // 2."\d"：任何数字[0-9]的简写； 字符串"" 中\需要写两个\\
        System.out.println("5".matches("\\d")); // true
        System.out.println("a".matches("\\d")); // false

        System.out.println("--------------------- \\D不能是数字 ----------------------------------");
        // 3."\D"：任何非数字[^0-9]的简写；
        System.out.println("5".matches("\\D")); // false
        System.out.println("a".matches("\\D")); // true

        System.out.println("--------------------- \\s代表空格 ----------------------------------");
        // 4.\s代表空格
        System.out.println(" ".matches("\\s")); // true
        System.out.println("a".matches("\\s")); // false

        System.out.println("----------------------- \\S不能是空格 --------------------------------");
        // 5.\S不能是空格
        System.out.println(" ".matches("\\S")); // false
        System.out.println("a".matches("\\S")); // true

        System.out.println("--------------------- \\w 代表[a-zA-Z_0-9] ----------------------------------");
        // 6."\w"：单词字符：[a-zA-Z_0-9]的简写
        System.out.println("a".matches("\\w")); // true
        System.out.println("B".matches("\\w")); // true
        System.out.println("3".matches("\\w")); // true
        System.out.println("_".matches("\\w")); // true
        System.out.println("好".matches("\\w")); // false

        System.out.println("------------------\\W 不能是 [a-zA-Z_0-9]------------------------------------");
        // \W 不能是 [^a-zA-Z_0-9]
        System.out.println("a".matches("\\W")); // false
        System.out.println("2".matches("\\W")); // false
        System.out.println("中".matches("\\W")); // true
    }
}
