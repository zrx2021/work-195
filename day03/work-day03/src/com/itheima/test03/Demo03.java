package com.itheima.test03;

/*

1.定义方向枚举Orientation，包含EAST, SOUTH, WEST, NORTH四个方向值
2.定义一个汽车类，包含属性品牌(brand)以及方法run(),在run方法中打印某个品牌的车正在往某个方向行驶

思路
1.定义方向枚举Orientation，包含EAST, SOUTH, WEST, NORTH四个方向值
2.定义小汽车Car类
    2.1 定义String类型的品牌(brand)，私有并且提供对应的get/set方法
    2.2 定义方法(run)，方法接收一个Orientation对象，方法中使用switch语句表示不同的方向
3.定义测试类Test，并包含main方法
4.在main方法中创建Car对象，调用setBrand()方法，并调用Car对象的run方法
 */
public class Demo03 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("问界M7");
        c.run(Orientation.SOUTH);
    }
}
