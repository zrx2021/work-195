package xuan.demo02xml解析并存储;

// 存储联系人的信息
public class Contact {
    private int id;
    private boolean vip;
    private String name;
    private String gender;
    private String email;

    public Contact() {
    }

    public Contact(int id, boolean vip, String name, String gender, String email) {
        this.id = id;
        this.vip = vip;
        this.name = name;
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
     * @return vip
     */
    public boolean isVip() {
        return vip;
    }

    /**
     * 设置
     * @param vip
     */
    public void setVip(boolean vip) {
        this.vip = vip;
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
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
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
        return "Contact{id = " + id + ", vip = " + vip + ", name = " + name + ", gender = " + gender + ", email = " + email + "}";
    }
}
