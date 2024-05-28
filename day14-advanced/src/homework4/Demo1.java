package homework4;

import homework2.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Cat> catClass = Cat.class;
        Method[] methods = catClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("method = " + method);
        }


        Cat cat = new Cat();
        Method run = catClass.getDeclaredMethod("run");
        System.out.println("run = " + run);
        run.setAccessible(true);
        Object invoke1 = run.invoke(cat);
        System.out.println(invoke1);

        Method eat = catClass.getDeclaredMethod("eat", String.class);
        System.out.println("eat = " + eat);
        eat.setAccessible(true);
        Object invoke2 = eat.invoke(cat, "小鱼干");
        System.out.println(invoke2);
    }
}
