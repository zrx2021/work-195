package xuan.demo03斗地主案例;

public class Poker {
    private String color;
    private String number;

    public Poker() {
    }

    public Poker(String color, String number) {
        this.color = color;
        this.number = number;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    public String toString() {
        return color + number;
    }
}
