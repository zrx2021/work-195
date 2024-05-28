package demo03ReflectExt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
目标: 使用反射 根据配置文件中的类名创建对象, 根据配置文件中的方法名调用对象的方法
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        createObjectAndInvokeMethod();
    }

    /**
     * 创建对象并调用方法
     */
    public static void createObjectAndInvokeMethod() throws Exception {
        // 1.读取config.properties文件
        Properties pp = new Properties();
        FileReader fr = new FileReader("day14-up\\src\\config.properties");
        pp.load(fr);
        fr.close();
        System.out.println("pp = " + pp); // {methodName=teach, className=com.itheima.demo03ReflectExt.Teacher}

        // 2.获取类名和方法名
        String className = pp.getProperty("className"); // com.itheima.demo03ReflectExt.Teacher
        String methodName = pp.getProperty("methodName"); // teach

        // 3.得到Class对象
        Class<?> cls = Class.forName(className);

        // 4.使用反射创建对象
        Object obj = cls.getConstructor().newInstance();

        // 5.使用反射调用方法
        Method method = cls.getMethod(methodName);

        Object ret = method.invoke(obj);
        System.out.println("ret = " + ret);
    }
}
