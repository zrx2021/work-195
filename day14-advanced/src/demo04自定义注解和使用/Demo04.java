package demo04自定义注解和使用;

// 注解的属性一定要赋值
// 注解就是一个标记, 还可以存储数据
@MyAnno(name = "西游记", price = 9.9)
public class Demo04 {

    @MyAnno(name = "水浒传")
    public static void main(String[] args) {

    }
}
