package xuan.demo01xml解析;

public class Contact {
    private int id;
    private String name;
    private boolean isVip;
    private char gender;
    private String email;

    public Contact() {
    }

    public Contact(int id, String name, boolean isVip, char gender, String email) {
        this.id = id;
        this.name = name;
        this.isVip = isVip;
        this.gender = gender;
        this.email = email;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return isVip
     */
    public boolean isIsVip() {
        return isVip;
    }

    /**
     * 设置
     * @param isVip
     */
    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Contact{id = " + id + ", name = " + name + ", isVip = " + isVip + ", gender = " + gender + ", email = " + email + "}";
    }
}
