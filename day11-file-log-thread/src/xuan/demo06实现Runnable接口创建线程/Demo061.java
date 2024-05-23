package xuan.demo06实现Runnable接口创建线程;

/*
目标: 实现Runnable接口创建线程
 */
public class Demo061 {
    public static void main(String[] args) {
        // 4.创建Thread对象,构造器传入Runnable实现类对象
        // Thread(Runnable target)
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run, 匿名内部类创建线程");
            }
        });

        // 5.启动新的线程, 新线程执行构造器参数mr对象的run方法
        t.start();


        System.out.println("----------------");
        Thread t2 = new Thread(() -> {
            System.out.println("run, Lambda表达式创建线程");
        });
        t2.start();
    }
}
