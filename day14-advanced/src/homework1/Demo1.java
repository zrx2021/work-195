package homework1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        UserServiceImpl usi = new UserServiceImpl();
        PrintStream ps = new PrintStream(new FileOutputStream("day14-advanced\\src\\log.txt", true));

        Object o = Proxy.newProxyInstance(Demo1.class.getClassLoader(), // 第一步，获取本类的Class对象然后获得类加载器
                new Class[]{UserService.class}, // 第二步，把接口的Class对象传入数组
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String methodName = method.getName();
                        long start = System.currentTimeMillis();
                        method.invoke(usi, args);
                        long end = System.currentTimeMillis();
                        ps.print("调用时间：" + LocalDateTime.now() + "，调用方法名称：" + methodName + "，调用方法参数：");
                        ps.println(Arrays.toString(args) + "，调用方法耗时：" + (end - start));
                        return null;
                    }
                });
        UserService proxy = (UserService) o;
        proxy.login("admin", "123456");
        proxy.deleteUsers();
    }
}
