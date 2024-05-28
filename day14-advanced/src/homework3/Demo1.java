package homework3;

import homework2.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo1 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Cat> cat = Cat.class;
        Field[] catsField = cat.getDeclaredFields();

        for (Field field : catsField) {
            System.out.println("成员变量: " + field);
        }

        Field name = cat.getDeclaredField("name");

        Cat catObject = cat.getConstructor().newInstance();

        name.setAccessible(true);
        name.set(catObject, "英国短毛猫");
        System.out.println(name.get(catObject));
    }
}
