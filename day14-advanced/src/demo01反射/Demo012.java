package demo01反射;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
目标：使用反射获取类中的构造器
    Constructor：构造器
    Declared：声明的/存在的
 */
public class Demo012 {
    @Test
    public void test01() {
        // 1.获取Class对象
        Class<Employee> cls = Employee.class;

        // 2.getConstructors()：获取所有public构造器
        // Constructor<?>[] cs = cls.getConstructors();

        // 3.获取所有存在的构造器
        Constructor<?>[] cs = cls.getDeclaredConstructors();

        for (Constructor<?> c : cs) {
            System.out.println(c);
        }
    }

    @Test
    public void test02() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1.获取Class对象
        Class<Employee> cls = Employee.class;

        // 2.getConstructor(Class<?>... parameterTypes)：获取一个public构造器
        Constructor<Employee> c1 = cls.getConstructor();
        System.out.println("c1 = " + c1);

        Employee emp = c1.newInstance();
        System.out.println("emp = " + emp);

        // 以前：使用构造器创建对象
        // Employee emp = new Employee();

        // 3.获取存在的构造器
        Constructor<Employee> c2 = cls.getDeclaredConstructor(String.class, int.class);
        System.out.println("c2 = " + c2);

        // 注意：类中私有的成分不能直接使用，需要暴力反射
        c2.setAccessible(true);// 让私有的也能访问
        Employee emp2 = c2.newInstance("张三", 18);// 相当于：Employee emp2 = new Employee("张三", 18);
        System.out.println("emp2 = " + emp2);
    }
}
