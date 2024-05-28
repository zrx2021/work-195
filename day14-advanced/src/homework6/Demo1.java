package homework6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties properties = new Properties();
        properties.load(new FileInputStream ("day14-advanced\\src\\homework6\\object.properties"));

        Object classname = properties.get("classname");
        Class<?> cls = Class.forName(classname.toString());

        Object cat = cls.getConstructor().newInstance();
        System.out.println(cat);
    }
}
