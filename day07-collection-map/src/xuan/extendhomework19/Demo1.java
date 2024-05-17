package xuan.extendhomework19;

public class Demo1 {
    public static void main(String[] args) {
        String str = "上海传智播客,上海黑马,武汉传智播客,深圳黑马,北京传智播客,广州黑马,北京黑马";
        String[] strings = str.split(",");
        int count = 0;

        for (String string : strings) {
            if (string.contains("传智播客") || string.contains("黑马")) {
                count++;
            }
        }

        System.out.println("一共出现了：" + count + "次");
    }
}
