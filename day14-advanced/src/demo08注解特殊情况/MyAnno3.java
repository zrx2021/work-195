package demo08注解特殊情况;

public @interface MyAnno3 {
    public String value();
    public double price() default 6.6;
}
