package homework5;

public @interface MyClassAnnotation {
    public String value();

    public String name() default "张三";
}
