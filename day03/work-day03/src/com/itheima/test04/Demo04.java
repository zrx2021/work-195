package com.itheima.test04;

/*
定义一个学生类，里面定义姓名和年龄两个属性。
重写toString()方法，改变输出对象时的内容

思路
1.定义一个学生类Student
  1.1 定义姓名(name)和年龄(age)两个属性，私有并且提供对应的get/set方法
  1.2 重写toString()方法，方法中实现字符串内容的拼接，把年龄和姓名拼接在一起
2.定义测试类，创建学生对象，并且输出对象
 */
public class Demo04 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("小明");
        s.setAge(18);
        System.out.println(s.toString());
    }
}
