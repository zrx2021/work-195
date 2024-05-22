package xuan.collection.set;

import java.util.HashSet;

class Student{
    int age;

    public Student() {
    }

    public Student(int age) {
        this.age= age;
    }
}

public class Demo03 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Student(18));
        set.add(new Student(18));
        set.add(new Student(20));

        System.out.println(set.size());
    }
}
