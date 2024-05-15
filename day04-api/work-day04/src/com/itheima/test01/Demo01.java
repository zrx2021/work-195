package com.itheima.test01;

/*
请编程进行以下运算：
  请计算3的5次幂
  请计算3.2向上取整的结果
  请计算3.8向下取整的结果
  请计算5.6四舍五入取整的结果
 */
public class Demo01 {
    public static void main(String[] args) {
        // 3的5次方
        System.out.println(Math.pow(3, 5));

        // 向上取整
        System.out.println(Math.ceil(3.2));

        // 向下取整
        System.out.println(Math.floor(3.8));

        // 四舍五入
        System.out.println(Math.round(5.6));
    }
}
