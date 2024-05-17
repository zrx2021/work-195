package xuan.extendhomework3;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        String text = "  anglebaby  	女 	 18	  515151511  ";
        text = text.trim();
        String[] strings = text.split("\\s+");

        System.out.println(Arrays.toString(strings));

        Person person = new Person(strings[0], strings[1].charAt(0), Integer.parseInt(strings[2]), strings[3]);

        System.out.println(person);

        boolean matches = person.getQQNumber().matches("[1-9]\\d{4,11}");

        System.out.println("这个人的QQ号是：" + (matches ? "合法" : "非法"));
    }
}
