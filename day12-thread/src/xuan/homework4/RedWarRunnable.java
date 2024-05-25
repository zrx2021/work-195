package xuan.homework4;

public class RedWarRunnable implements Runnable{
    private int redWar = 3;

    @Override
    public void run() {
        synchronized (RedWarRunnable.class) {
            String name = Thread.currentThread().getName();
            if (redWar > 0) {
                System.out.println("恭喜" + name + "，你成功抢到一个20元的红包，红包总数量减1");
                redWar--;
            } else {
                System.out.println(name + "抱歉，红包已经被抢完了");
            }
        }
    }
}
