package xuan.demo12方法重写;

/*
方法重写：
    子类觉得父类方法功能不够强，子类重写一遍这个方法

    方法重写要求：
    1.子类继承父类
    2.方法名形同
    3.参数列表相同
    4.返回值类型“相同”
    5.修饰符“相同”

    子类重写父类方法时，访问权限必须大于或者等于父类该方法的权限（ public > protected > 缺省 ）。
    重写的方法返回值类型，必须与被重写方法的返回值类型一样，或者范围更小。（引用类型 父类大，子类小）（重写方法返回子类类型）
    私有方法、静态方法不能被重写。

 */

public class Demo1 {
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.call();
        np.sendMessage();
    }
}
