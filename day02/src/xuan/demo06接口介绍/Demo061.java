package xuan.demo06接口介绍;

/*
    目标：掌握接口的使用

    接口中都是抽象方法，强制去实现的，接口体现的是规范的意思
*/
public class Demo061 {
    public static void main(String[] args) {
        // 常量：类名.变量名
        System.out.println(ChinesePerson.COUNTRY_NAME);

        // 接口是抽象的，不能创建对象
        // ChinesePerson c = new ChinesePerson();

        Student s = new Student();
        s.eat();
        s.dance();
    }
}
