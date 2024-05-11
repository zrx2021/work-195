package xuan.demo06接口介绍;

// 接口和类一样是一种特殊的结构（数据结构）
public interface ChinesePerson {
    // 成员变量（常量），默认添加 public static final
    public static final String COUNTRY_NAME = "中国";

    // 成员方法（抽象方法），默认添加public abstract
    public abstract void eat();
}
