package xuan.demo11正则表达式规则;

/*
目标:学习正则表达式-字符类
    Java中正则表达式的使用规律
        "要匹配的字符串".matches(正则表达式);
        正则表达式是一位一位匹配的

小结:
    [] 表示取其中一个匹配
    - 表示范围
 */
public class Demo071 {
    public static void main(String[] args) {
        System.out.println("----------------------- 字符类[] (只能匹配单个字符) --------------------------------");

        // 正则表达式-字符类: [] 表示取其中一个匹配      - 表示范围
        // 1.[abc]：代表a或者b，或者c字符中的一个。
        System.out.println("你a好".matches("你[abc]好")); // true
        System.out.println("你b好".matches("你[abc]好")); // true
        System.out.println("你x好".matches("你[abc]好")); // false

        // 2.[a-z]：代表a-z的所有小写字符中的一个。
        System.out.println("你x好".matches("你[a-z]好")); // true
        System.out.println("你X好".matches("你[a-z]好")); // false
        System.out.println("你xx好".matches("你[a-z]好")); // false
        System.out.println("你xx好".matches("你[a-z]x好")); // true

        // 3.[A-Z]：代表A-Z的所有大写字符中的一个。
        System.out.println("你X好".matches("你[A-X]好")); // true
        System.out.println("你X好".matches("你[A-D]好")); // false

        // 4.[0-9]：代表0-9之间的某一个数字字符。
        System.out.println("你8好".matches("你[0-9]好")); // true
        System.out.println("你10好".matches("你[0-9]好")); // false

        // 5.[a-zA-Z0-9]：代表a-z或者A-Z或者0-9之间的任意一个字符。
        System.out.println("你6好".matches("你[a-zA-Z0-9]好")); // true
        System.out.println("你A好".matches("你[a-zA-Z0-9]好")); // true
        System.out.println("你m好".matches("你[a-zA-Z0-9]好")); // true

        // 6.[^abc]：代表除a,b,c以外的任何字符。
        System.out.println("你a好".matches("你[^abc]好")); // false
        System.out.println("你d好".matches("你[^abc]好")); // true

        // 7.[a-z&&[def23]] d、e 或 f
        System.out.println("你d好".matches("你[a-z&&[def23]]好")); // true
        System.out.println("你f好".matches("你[a-z&&[def23]]好")); // true
        System.out.println("你2好".matches("你[a-z&&[def23]]好")); // false
        System.out.println("你3好".matches("你[a-z&&[def23]]好")); // false
    }
}
