package xuan.demo09异常注意事项;

/*
我们学面向对象的时候知道子类可以重写父类的方法，当父类方法throws异常时，子类方法如何处理呢？
    子类重写方法throws的异常要比父类方法throws的异常相同或更少
 */

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Fu {
    // 必须使用编译时异常
    public void test01() throws IOException, ParseException {}

    public void test02() {}
}

class Zi extends Fu {
    // 子类重写方法throws的异常要比父类方法throws的异常相同或更少
    @Override
    public void test01() throws IOException, ParseException {

    }

    // 如果父类方法没有throws异常, 子类重写方法也不能throws异常, 只能try...catch
    @Override
    public void test02() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
            Date date = sdf.parse("2024-05-19");
            System.out.println("date = " + date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}