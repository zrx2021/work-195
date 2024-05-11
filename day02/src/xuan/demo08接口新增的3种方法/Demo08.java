package xuan.demo08接口新增的3种方法;

/*
目标: 了解JDK8接口新增的三种方法
 */
public class Demo08 {
    public static void main(String[] args) {
        // 接口的默认方法,实现类可以直接使用
        KeyBoard k = new KeyBoard();
        k.exit();

        // 接口静态方法, 使用接口名.静态方法名();
        USB.test();
    }
}
