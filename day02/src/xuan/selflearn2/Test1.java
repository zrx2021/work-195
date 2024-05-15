package xuan.selflearn2;

public class Test1 {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        NewPhone newPhone = new NewPhone();

        oldPhone.call();
        oldPhone.sendMessage();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.playGame();
    }
}
