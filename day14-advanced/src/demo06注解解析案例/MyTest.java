package demo06注解解析案例;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 让注解只能放在方法上
@Target(value = ElementType.METHOD)
// 让注解存活到运行
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyTest {
    // 运行的次数
    public int count() default 1;
}
