package xuan.demo02static修饰成员方法;

import java.util.Random;

public class VerifyCodeUtils {
    // 自己手动生成无参构造，private修饰构造器，其他类不能使用
    private VerifyCodeUtils() {

    }

    public static String generateCode(int n) {
        // 定义变量保存生成的每位验证码
        String code = "";

        // 创建随机数对象
        Random r = new Random();
        // 循环生成每位验证码
        for (int i = 0; i < n; i++) {
            code += r.nextInt(10);
        }

        // 返回验证码
        return code;
    }
}
