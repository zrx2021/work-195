package xuan.demo10Object类的toString方法;

/*
Object类的equals方法默认比较对象地址，子类可以重写equals，去比较属性
 */
public class Equals方法 {
    public static void main(String[] args) {
        System.out.println(3 == 5);

        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张三", 18);
        Student s3 = new Student("李四", 18);
        System.out.println(s1 == s2);// false
        // 想使用对象的属性，使用对象的equals
        System.out.println(s1.equals(s2));

        // Java中的类可能会重写equals，String比较内容
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2));
    }
}
