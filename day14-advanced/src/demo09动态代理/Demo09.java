package demo09动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/*
目标: 创建代理对象

Proxy类:
    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
    方法的作用: 创建代理对象
    ClassLoader loader: 类加载器,   当前类名.class.getClassLoader()
    Class<?>[] interfaces: 多个接口, 代理对象会实现这些接口
    InvocationHandler h: 执行处理器, 放代理要执行的代码,  InvocationHandler是接口, 传入匿名内部类对象

    int[] arr = new int[] {11, 22};
 */
public class Demo09 {
    public static void main(String[] args) {
        // 1.创建真实对象（被代理对象）
        WangBaoQiang wbq = new WangBaoQiang();

        // 2.创建代理对象
        Star proxy = (Star) Proxy.newProxyInstance(
                Demo09.class.getClassLoader(),// 类加载器
                new Class[]{Star.class},// 需要代理的接口
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 4.在invoke中放重复代码，要增强的功能代码
                        // System.out.println("proxy = " + proxy.toString()); // 不要打印代理对象，因为代理对象调用方法就会执行invoke，会递归调用invoke导致栈溢出
                        // System.out.println("method = " + method);
                        // System.out.println("args = " + Arrays.toString(args));
                        // 放代理要执行的代码
                        System.out.println("电话沟通");
                        System.out.println("签合同，付首付");
                        // 宝强的真实功能
                        Object ret = method.invoke(wbq, args);// wbq.sing("唱明天会更好"); 或 wbq.dance();

                        System.out.println("结尾款");
                        return ret;
                    }
                }
        );

        // 3.代理对象调用方法，代理对象调用任何方法都会执行invoke方法
        proxy.sing("明天会更好");
        System.out.println("---------------");
        proxy.dance();
    }
}
