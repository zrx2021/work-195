package xuan.demo11正则表达式规则;

/*
目标:正则表达式-数量词(限定符)
    X? : 0次或1次
    X* : 0次1次到多次
    X+ : 1次或多次

    X{n} : 恰好n次
    X{n,} : 至少n次
    X{n,m}: n到m次(n和m都是包含的)
 */
public class Demo073 {
    public static void main(String[] args) {
        System.out.println("---------------------- {n} 正好n次 ---------------------------------");
        // X{n} : 恰好n次
        System.out.println("a3c".matches("\\w{3}")); // true
        System.out.println("abcd".matches("\\w{3}")); // false
        System.out.println("ab".matches("\\w{3}")); // false

        System.out.println("---------------------- {n,} 至少n次 ---------------------------------");
        // X{n,} : 至少n次
        System.out.println("abc".matches("\\w{3,}")); // true
        System.out.println("abcd".matches("\\w{3,}")); // true
        System.out.println("ab".matches("\\w{3,}")); // false

        System.out.println("---------------------- {n,m} n到m次(n和m都是包含的) ---------------------------------");
        // X{n,m}: n到m次(n和m都是包含的)
        System.out.println("abc".matches("\\w{3,5}")); // true
        System.out.println("abc23".matches("\\w{3,5}")); // true
        System.out.println("abc232d".matches("\\w{3,5}")); // false
        System.out.println("ab".matches("\\w{3,5}")); // false

        System.out.println("----------------- ? 代表前面的内容可以出现 1次或者0次 --------------------------------------");
        // X? : 0次或1次
        System.out.println("a".matches("\\w?")); // true
        System.out.println("".matches("\\w?")); // true
        System.out.println("abc".matches("\\w?")); // false

        System.out.println("------------------------ * 0次或者多次 -------------------------------");
        // X* : 0次1次或者多次
        System.out.println("abc12".matches("\\w*")); // true
        System.out.println("".matches("\\w*")); // true
        System.out.println("a".matches("\\w*")); // true
        System.out.println("abc12张".matches("\\w*张")); // true

        System.out.println("---------------------- + 1次或者多次 ---------------------------------");
        // + 1次或者多次
        System.out.println("abc12".matches("\\w+")); // true
        System.out.println("a".matches("\\w+")); // true
        System.out.println("".matches("\\w+")); // false
    }
}
