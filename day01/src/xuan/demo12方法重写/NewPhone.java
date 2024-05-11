package xuan.demo12方法重写;

// 新手机继承旧手机的功能
public class NewPhone extends OldPhone {
    // idea自动生成方法重写，输入父类方法名后选择
    @Override
    public void call() {
        //super.call();忽略这行
        // 子类功能更强大
        System.out.println("语音通话、视频通话");
    }

    @Override
    public void sendMessage() {
        //super.sendMessage();
        System.out.println("发文字、发图片、发语音");
    }
}
