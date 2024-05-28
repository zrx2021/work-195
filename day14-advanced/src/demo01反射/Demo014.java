package demo01反射;

import org.junit.Test;

import java.lang.reflect.Field;

/*
目标: 获取成员变量并使用
 */
public class Demo014 {
    @Test
    public void test01() {
        // 1.获取Class对象
        Class<Employee> cls = Employee.class;

        // 2.getFields(): 获取所有public的成员变量
        // Field[] fs = cls.getFields();

        // 3.getDeclaredFields()获取所有存在的成员变量
        Field[] fs = cls.getDeclaredFields();

        for (Field f : fs) {
            System.out.println("f = " + f);
        }
    }

    @Test
    public void test02() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        // 1.获取Class对象
        Class<Employee> cls = Employee.class;
        // // 使用无参构造创建对象
        Employee emp = cls.newInstance();

        // 2.getField(成员变量): 获取一个public的成员变量
        Field f1 = cls.getField("weight");
        System.out.println("f1 = " + f1);

        // 3.获取所有存在的成员变量
        Field f2 = cls.getDeclaredField("age");
        System.out.println("f2 = " + f2);

        f2.setAccessible(true);
        // public void set(Object obj, Object value)：给成员变量赋值
        // Object obj：成员变量所在对象
        // Object value：要赋值的数据
        f2.set(emp, 18);// 相当于：emp.age = 18; // 给成员变量赋值
        System.out.println("set赋值后 emp = " + emp);

        // public Object get(Object obj)：获取成员变量的值
        // Object obj：成员变量所在的对象
        Object ret = f2.get(emp);// 相当于：emp.age; // 获取成员变量的值
        System.out.println("ret = " + ret);
    }
}
