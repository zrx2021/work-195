package xuan.demo01匿名内部类;

public class Demo01 {
    public static void main(String[] args) {
        // 3.创建实例对象
        Student s1 = new Student();
        s1.swimming();

        // 使用匿名内部类对象（简化代码）
        Swimmable s2 = new Swimmable() {
            @Override
            public void swimming() {
                System.out.println("游泳2");
            }
        };

        goSwimming(s1);// 需要五个步骤

        // 匿名内部类的使用场景：把匿名内部类对象作为参数（一步搞定）
        goSwimming(new Swimmable() {
            @Override
            public void swimming() {
                System.out.println("游泳3");
            }
        });
    }

    // 参数是接口，调用方法时传入接口的实现类对象
    public static void goSwimming(Swimmable s) {
        s.swimming();
    }
}
