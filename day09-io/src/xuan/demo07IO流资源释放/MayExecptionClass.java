package xuan.demo07IO流资源释放;

import java.io.Closeable;

public class MayExecptionClass implements Closeable {
    @Override
    public void close() {
        System.out.println("可能会出现异常的类已经执行了资源释放方法close()");
    }
}
