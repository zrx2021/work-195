package demo07注解案例2;

/*
目标：了解反射的作用：做高级框架。
    需求：对于任意类的对象，这个框架都可以保存该对象的字段和值
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("柳岩", 43, '女', 168.5, "跑步、健身");
        DataFrameUtils.saveObject(s1);

        Teacher t1 = new Teacher("播妞", 6000);
        DataFrameUtils.saveObject(t1);

        Worker w1 = new Worker("张全蛋", 18, 6000);
        DataFrameUtils.saveObject(w1);
    }
}
