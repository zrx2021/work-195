package demo01反射;

/*
目标: 获取Class对象
    Class是一个类, 这个类的对象就称为Class对象, Class对象是一个容器, 或保存类中是所有信息
 */
public class Demo011 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.类名.class       Class<Employee>: Class对象中保存Employee类的所有信息
        Class<Employee> cls1 = Employee.class;
        System.out.println("cls1 = " + cls1); // class com.itheima.demo01获取Class对象.Employee

        // 2.对象.getClass()      Class<? extends Employee>: Class对象中保存Employee或子类的所有信息
        Employee emp = new Employee();
        Class<? extends Employee> cls2 = emp.getClass();
        System.out.println("cls2 = " + cls2);

        // 3.Class.forName(类全名)     Class<?>: Class对象中保存未知类的所有信息
        Class<?> cls3 = Class.forName("com.itheima.demo01反射.Employee");
        System.out.println("cls3 = " + cls3);

        // 这三种方法获取的Class对象是同一个
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);
    }
}
