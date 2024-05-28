package demo06注解解析案例;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
目标: 模拟Junit单元测试的@Test注解
 */
public class Demo06 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        // 3.反射获取Class对象
        Class<Student> cls = Student.class;
        Student stu = cls.newInstance();

        // 4.反射获取所有的方法
        Method[] ms = cls.getMethods();

        // 5.遍历方法,获取每个方法
        for (Method m : ms) {
            // 6.判断方法上是否有注解
            boolean b = m.isAnnotationPresent(MyTest.class);
            if (b) {
                // 7.如果有注解, 解析注解, 获取count的值
                MyTest anno = m.getDeclaredAnnotation(MyTest.class);
                int count = anno.count();

                // 8.运行方法
                for (int i = 0; i < count; i++) {
                    m.invoke(stu); // stu.m对应的方法();
                }
            }
        }
    }
}
