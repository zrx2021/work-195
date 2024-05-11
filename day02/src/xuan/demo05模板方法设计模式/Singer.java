package xuan.demo05模板方法设计模式;

// 抽象方法在内中，所以类要变成抽象类
public abstract class Singer {
    // final修饰防止模板方法sing被子类重写
    public final void sing() {
        System.out.println("上台");
        System.out.println("打开话筒");
        doSing();
        System.out.println("关闭话筒");
        System.out.println("鞠躬");
    }

    public abstract void doSing();
}
