package demo06注解解析案例;

import java.io.FileNotFoundException;

public class Demo062 {
    public static void main(String[] args) throws FileNotFoundException, IllegalAccessException {
        Student2 student2 = new Student2("张三", 18, '男', 175.5, "唱跳rap");
        DataFrameUtils.saveObject(student2);
    }
}
