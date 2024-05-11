package xuan.homework4;

public class Computer {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();

        use(keyboard);
        System.out.println("--------------------");
        use(mouse);
    }

    private static void use(USB usb) {
        usb.connect();
        if (usb instanceof Keyboard keyboard) {
            keyboard.input();
        }

        if (usb instanceof Mouse mouse) {
            mouse.click();
        }
        usb.exit();
    }
}
