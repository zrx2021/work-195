package xuan.demo01xml解析;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/*
目标: 使用dom4j解析XML
 */
public class Demo01 {
    public static void main(String[] args) throws DocumentException {
        // 1.创建解析器
        SAXReader reader = new SAXReader();

        // 2.使用解析器解析XML, 得到Document(解析完成,形成了DOM树)
        Document document = reader.read(new File("day11-file-log-thread\\src\\Contact.xml"));

        // 3.获取根元素
        Element rootElement = document.getRootElement();
        System.out.println("根元素 rootElement = " + rootElement);

        // 得到当前元素的文本
        String text = rootElement.getText();
        System.out.println("当前元素的文本 = " + text);

        // 4.String getName(): 获取元素名称
        System.out.println("根元素名称：" + rootElement.getName());

        // 5.Element element(String name): 获取一个指定名称的子元素(如果有多个名字相同的子元素,返回第一个)
        Element contactEle = rootElement.element("contact");
        System.out.println("contactEle = " + contactEle);

        // 6.List<Element> elements(): 获取所有子元素
        List<Element> elements = rootElement.elements();

        // 7.List<Element> elements(String name): 获取所有指定名称的子元素
        List<Element> elementList = rootElement.elements("contact");

        for (Element element : elementList) {
            System.out.println("元素名：" + element.getName());

            // 8.String attributeValue(String name): 通过属性名得到属性值
            String idStr = element.attributeValue("id");
            System.out.println("\tidStr = " + idStr);

            String vipStr = element.attributeValue("vip");
            System.out.println("\tvipStr = " + vipStr);

            // 9.String elementText(String name): 通过子元素名称, 得到子元素的文本
            String name = element.elementText("name");
            String gender = element.elementText("gender");
            String email = element.elementText("email");

            System.out.println("\tname = " + name);
            System.out.println("\tgender = " + gender);
            System.out.println("\temail = " + email);
        }

    }
}
