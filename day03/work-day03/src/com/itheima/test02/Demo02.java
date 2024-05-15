package com.itheima.test02;

/*
练习二：
    请编写一个接口Phone,两个抽象方法,call() sendMessage()
    使用匿名内部类的方式调用 call 和 sendMessage方法

思路
1.创建接口Phone,定义抽象方法打电话call()和发信息sendMessage()
2.创建测试类，使用匿名内部类的方式创建对象，调用方法
 */
public class Demo02 {
    public static void main(String[] args) {
        // 使用匿名内部类创建phone对象并调用方法
        Phone p = new Phone() {
            @Override
            public void call() {
                System.out.println("打电话给老相好~");
            }

            @Override
            public void sendMessage() {
                System.out.println("发短信给刘亦菲");
            }
        };
        p.call();
        p.sendMessage();
    }
}
