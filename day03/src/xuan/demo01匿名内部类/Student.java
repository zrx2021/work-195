package xuan.demo01匿名内部类;

// 1.定义实现类接口
public class Student implements Swimmable {
    // 2.重写/实现抽象方法
    @Override
    public void swimming() {
        System.out.println("学生游泳1");
    }
}
