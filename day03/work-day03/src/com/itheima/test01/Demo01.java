package com.itheima.test01;

/*
根据需求，完成如下代码，并在测试类中进行测试
    员工类Employee
    属性:姓名工号工资
    抽象方法:工作(work),开会(meet)
    使用匿名内部类方式创建一个员工对象,并调用其工作和开会的功能

思路
1.创建抽象类Employee
    1.1 定义成员变量，姓名(name),工号(id),工资(salary),私有成员变量
    1.2 提供get/set方法
    1.3 提供无参构造和满参构造
    1.4 定义抽象方法工作(work())和开会(meet())
2.创建测试类，使用匿名内部类的格式去创建Employee的对象，重写方法。使用对象对调用方法
 */
public class Demo01 {
    public static void main(String[] args) {
        // 父类 变量名 = new 子类();
        Employee e = new Employee() {
            @Override
            public void work() {
                System.out.println("有人在工作");
            }

            @Override
            public void meet() {
                System.out.println("有人在开会");
            }
        };

        e.work();
        e.meet();
    }
}
