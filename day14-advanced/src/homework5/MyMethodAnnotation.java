package homework5;

public @interface MyMethodAnnotation {
    public String aaa();

    public boolean bbb() default true;

    public String[] ccc();
}
