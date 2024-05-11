package xuan.demo03抽象方法和抽象类;

/*
    1.抽象方法必须要在抽象类中
    2.抽象类不能创建对象
    3.抽象方法必须被子类重写（且全部被重写，否则该类仍为抽象类），强制让继承的人写方法，防止调用子类方法时缺失功能
    4.抽象方法没有方法体
*/
public class Demo031 {
    public static void main(String[] args) {
        // 抽象类不能创建对象，让你使用子类
        // Animal animal = new Animal();

        // 创建子类Dog
        Dog dog = new Dog();
        dog.run();

        // 创建子类Chicken
        Chicken chicken = new Chicken();
        chicken.run();

        // Animal animal = new Chicken();
        // animal.run();
    }
}
