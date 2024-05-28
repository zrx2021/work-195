package demo01反射;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
目标: 使用反射获取成员方法并使用
 */
public class Demo013 {
    @Test
    public void test01() {
        // 1.获取Class对象
        Class<Employee> cls = Employee.class;

        // 2.getMethods()：获取所有public的方法，包含父类的
        // Method[] ms = cls.getMethods();

        // 3.getDeclaredMethods()：获取所有存在的方法
        Method[] ms = cls.getDeclaredMethods();

        for (Method m : ms) {
            System.out.println(m);
        }
    }

    @Test
    public void test02() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        // 1.获取Class对象
        Class<Employee> cls = Employee.class;

        // Employee emp = new Employee();
        // Employee emp = cls.getConstructor().newInstance(); // 反射获取无参数构造并创建对象
        Employee emp = cls.newInstance();// 反射无参数构造并创建对象

        // 2.getMethod(方法名, 参数类型...)获取一个public的方法
        Method m1 = cls.getMethod("getName");
        System.out.println("m1 = " + m1);

        // 3.getDeclaredMethod(方法名, 参数类型...)获取一个存在的方法
        Method m2 = cls.getDeclaredMethod("sleep", int.class);
        System.out.println("m2 = " + m2);

        // public Object invoke(Object obj, Object... args)：执行本方法
        // Object obj：调用本方法的对象
        // Object... args：调用方法时传入的参数
        // 返回值Object
        m2.setAccessible(true);
        Object ret = m2.invoke(emp, 8);// 相当于 int ret = emp.sleep(8);
        System.out.println("ret = " + ret);

        Method m3 = cls.getDeclaredMethod("setName", String.class);
        System.out.println("m3 = " + m3);
        Object ret2 = m3.invoke(emp, "李四");
        System.out.println("ret2 = " + ret2);
        System.out.println("emp = " + emp);
    }
}
