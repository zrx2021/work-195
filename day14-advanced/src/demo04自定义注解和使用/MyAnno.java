package demo04自定义注解和使用;

public @interface MyAnno {
    // 属性
    public String name();

    // 属性可以有默认值, 如果不给这个属性赋值, 就使用默认值
    public double price() default 6.6;
}
