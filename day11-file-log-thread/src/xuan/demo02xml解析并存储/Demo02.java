package xuan.demo02xml解析并存储;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
目标: 使用dom4j解析XML
小结:
    数据存储在XML中
    1.每次使用时去解析XML, 这种方式, 性能低
    2.解析一次, 把数据保存到对象和集合中, 后续操作集合即可, 性能高
 */
public class Demo02 {
    public static void main(String[] args) throws DocumentException {
        // 1.创建解析器
        SAXReader reader = new SAXReader();

        // 2.使用解析器解析XML, 得到Document(解析完成,形成了DOM树)
        Document document = reader.read(new File("day11-file-log-thread\\src\\Contact.xml"));

        // 3.获取根元素
        Element rootElement = document.getRootElement();
        System.out.println("根元素 rootElement = " + rootElement);

        // 7.List<Element> elements(String name): 获取所有指定名称的子元素
        List<Element> elementList = rootElement.elements("contact");

        List<Contact> list = new ArrayList<>();
        for (Element element : elementList) {

            // 8.String attributeValue(String name): 通过属性名得到属性值
            String idStr = element.attributeValue("id");
            String vipStr = element.attributeValue("vip");

            // 9.String elementText(String name): 通过子元素名称, 得到子元素的文本
            String name = element.elementText("name");
            String gender = element.elementText("gender");
            String email = element.elementText("email");

            int id = Integer.parseInt(idStr);
            boolean vip = Boolean.parseBoolean(vipStr); // "true" -> true,  其他全部转为false

            // 把解析到的contact标签数据保存到Contact对象中
            Contact c = new Contact(id, vip, name, gender, email);
            // 把Contact对象保存到集合中
            list.add(c);
        }

        // 以后要用数据, 只要操作List集合即可
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }
}
