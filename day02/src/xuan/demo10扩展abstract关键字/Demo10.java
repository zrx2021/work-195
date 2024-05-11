package xuan.demo10扩展abstract关键字;

/*
面试题: abstract不能和哪些关键字组合?
    abstract抽象的目的强制去重写, 影响重写的都不行: final, private, static
 */
public abstract class Demo10 {

    public abstract void test();

    public static void main(String[] args) {

    }
}
