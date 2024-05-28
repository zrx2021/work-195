package demo08注解特殊情况;

import demo04自定义注解和使用.MyAnno;

import java.util.ArrayList;

public @interface MyAnno4 {
    public int a();

    public String b();

    public Class c();

    public MyAnno d();

    public WeekDay e();

    public int[] f();

    // 不行
    // public Integer g();
    // public ArrayList h();
}

enum WeekDay {
    SUN, MON;
}
