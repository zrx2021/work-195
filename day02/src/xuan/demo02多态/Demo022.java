package xuan.demo02多态;

/*
    目标：体验多态的好处
 */
public class Demo022 {
    public static void main(String[] args) {
        Person p1 = new Student();
        Person p2 = new Teacher();

        goRun(p1);
        goRun(p2);
    }

    // 你写的，方法参数写父类，调用方法时可以传入他的任意子类，拓展性强
    // 定义方法，让所有人都能跑步
    public static void goRun(Person person) {
        person.run();
    }
}
