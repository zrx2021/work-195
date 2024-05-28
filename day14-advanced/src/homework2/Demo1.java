package homework2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Cat> cls = Cat.class;

        Constructor<Cat> c = cls.getDeclaredConstructor();
        System.out.println("获取无参数构造器：" + c);

        Cat cat = c.newInstance();
        System.out.println("获取无参构造器: " + cat);

        Constructor<Cat> pc = cls.getDeclaredConstructor(String.class, int.class);
        pc.setAccessible(true);
        Cat cat1 = pc.newInstance("小白", 2);
        System.out.println("使用有参构造器创建对象: " + cat1);
    }
}
