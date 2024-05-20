package xuan.demo10Object类的toString方法;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }
    //                      alt + insert
    // 快捷键生成equals(): 右键 -> Generate -> hashCode() and equals()
    // IDEA的模板

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 父类Object的toString()返回: 类名@地址, 子类觉得这个方法不满足自己的要求, 子类可以重写toString()方法
    // 快捷键生成toString(): 右键 -> Generate -> toString()
    @Override
    public String toString() {
        return "Student[name：" + name + "，age：" + age + "]";
    }

    // 手动重写equals
    // @Override
    // public boolean equals(Object obj) {
    //     // 说明是同一个对象, 直接返回true
    //     if (this == obj) {
    //         return true;
    //     }
    //
    //     // 参数为null直接返回false
    //     if (obj == null) {
    //         return false;
    //     }
    //
    //     // getClass(): 拿到对象的包名.类名
    //     if (this.getClass() != obj.getClass()) {
    //         return false;
    //     }
    //
    //     // obj类型是对的, 把obj转成Student类型
    //     Student s = (Student) obj;
    //
    //     // 如果年龄不同, 返回false
    //     if (this.age != s.age) {
    //         return false;
    //     }
    //
    //     // 如果姓名不同, 返回false
    //     if (!this.name.equals(s.name)) {
    //         return false;
    //     }
    //     // 姓名,年龄相同
    //     return true;
    // }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (this.age != student.age) return false;
        return Objects.equals(this.name, student.name);
    }

    // 子类需要重写, 不然用不了Object类中的clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    } */
}
