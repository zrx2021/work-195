package xuan.demo02static修饰成员方法;

public class Demo1 {
    public static void main(String[] args) {
        // VerifyCodeUtils vc = new VerifyCodeUtils();
        // vc.generateCode();

        System.out.println("登录时生成验证码：" + VerifyCodeUtils.generateCode(5));
        System.out.println("注册时生成验证码：" + VerifyCodeUtils.generateCode(6));
        System.out.println("修改密码时生成验证码：" + VerifyCodeUtils.generateCode(7));

        // Java自带的工具类
        // Arrays.toString(new int[] {});
    }
}
