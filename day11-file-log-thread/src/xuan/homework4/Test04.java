package xuan.homework4;

/*
1.使用继承Thread方式创建多线程，利用多线程用字节流将`d:\abc\xyz.png`图片复制到E盘下`e:\abc\xyz2.png`
2.使用实现Runnable方式创建多线程，利用多线程用字节流将`d:\abc\xyz.png`图片复制到E盘下`e:\abc\xyz3.png`
 */
public class Test04 {
    public static void main(String[] args) {
        // 10.在测试类的main方法中创建CopyThread类的对象
        CopyThread ct = new CopyThread();
        // 11.调用start方法启动线程
        ct.start();

        // 20.在测试类的main方法中创建CopyRunnable类的对象
        CopyRunnable cr = new CopyRunnable();
        // 21.创建Thread对象,在构造器参数中传入前面创建的CopyRunnable类的对象
        Thread t = new Thread(cr);
        // 22.调用start方法启动线程
        t.start();
    }
}