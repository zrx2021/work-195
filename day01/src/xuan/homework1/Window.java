package xuan.homework1;

public class Window {
    private String name;
    private static int ticketNumber = 100;

    public Window() {
    }

    public Window(String name) {
        this.name = name;
    }

    public void saleTicket() {
        System.out.println("售票成功，剩余票数" + --ticketNumber + "张");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTicketNumber() {
        return ticketNumber;
    }

    public static void setTicketNumber(int ticketNumber) {
        Window.ticketNumber = ticketNumber;
    }
}
