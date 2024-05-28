package demo10动态代理练习;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
目标：使用动态代理 统计UserServiceImpl类中login和deleteUsers方法的耗时
 */
public class Demo10 {
    public static void main(String[] args) throws Exception {
        // 1.创建真实对象/被代理的对象
        UserServiceImpl userService = new UserServiceImpl();

        // 2.创建动态代理对象
        UserService proxy = (UserService) Proxy.newProxyInstance(
                Demo10.class.getClassLoader(), // 类加载器
                new Class[]{UserService.class}, // 代理要实现的多个接口
                new InvocationHandler() { // 执行处理器, 编写代理要执行的代码, 是一个接口, 传入匿名内部类对象
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 4.在invoke方法进行统一处理
                        // 记录开始时间
                        long start = System.currentTimeMillis();
                        // 调用目标对象的功能
                        Object ret = method.invoke(userService, args); // userService.login("admin", "123456"); 或 userService.deleteUsers();

                        // 记录结束时间
                        long end = System.currentTimeMillis();
                        // 统计耗时
                        System.out.println(method.getName() + " 方法耗时: " + (end - start) / 1000.0 + " s");
                        return ret;
                    }
                }
        );

        // 3.使用代理对象调用方法
        proxy.login("admin2", "1234562");
        proxy.deleteUsers();
    }
}
