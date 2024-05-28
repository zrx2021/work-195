package demo06注解解析案例;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class DataFrameUtils {
    /**
     * 保存任意对象的成员变量名和值到文件中
     * @param obj 对象
     */
    public static void saveObject(Object obj) throws FileNotFoundException, IllegalAccessException {
        // 创建打印流
        PrintStream ps = new PrintStream(new FileOutputStream("day14-advanced\\src\\data.txt", true));

        // 1.反射获取Class对象
        Class<?> cls = obj.getClass();
        ps.println("===================" + cls.getName() + "===================");

        // 2.反射获取类中的所有成员变量
        Field[] fs = cls.getDeclaredFields();

        // 3.遍历数组得到每个成员变量
        for (Field f : fs) {
            // 4.获取成员变量的名称和值
            f.setAccessible(true);

            // 判断成员变量上是否有Save注解
            if (f.isAnnotationPresent(Save.class)) {
                // 成员变量上有Save注解, 获取Save注解
                Save anno = f.getDeclaredAnnotation(Save.class);
                if (anno.isNameValue()) {
                    String name = f.getName();
                    Object value = f.get(obj);

                    // 5.把变量的名称和值保存到文件中
                    ps.println(name + ":" + value);
                } else {
                    String name = f.getName();
                    ps.println(name);
                }
            }
        }

        ps.close();
    }
}
