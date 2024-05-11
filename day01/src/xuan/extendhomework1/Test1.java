package xuan.extendhomework1;

/*
 棕色的Tom猫会吃和抓老鼠
 白色的Jerry狗会吃和看家
 要求: 把猫和狗的共性抽取到动物类中
 */
public class Test1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "棕色");
        cat.eat();
        cat.catchMouse();
        System.out.println("--------------------");
        Dog dog = new Dog();
        dog.setName("Jerry");
        dog.setColor("白色");
        dog.eat();
        dog.lookHome();
    }
}
