package homework5;

@MyClassAnnotation("abc")
public class Demo1 {
    public static void main(String[] args) {

    }

    @MyMethodAnnotation(aaa = "诸葛亮", bbb = false, ccc = {"Python", "前端", "Java"})
    public void test1() {

    }

    @MyMethodAnnotation(aaa = "周瑜", ccc = {"HTML", "Java"})
    public void test2() {

    }
}
