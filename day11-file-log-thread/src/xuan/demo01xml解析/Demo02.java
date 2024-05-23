package xuan.demo01xml解析;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("day110-file-log-thread\\src\\Contact.xml"));

        Element rootElement = document.getRootElement();

        List<Element> contact = rootElement.elements("contact");
        List<Contact> contacts = new ArrayList<>();

        for (Element element : contact) {
            int id = Integer.parseInt(element.attributeValue("id"));
            boolean vipStr = Boolean.parseBoolean(element.attributeValue("vip"));
            String name = element.elementText("name");
            char gender = element.elementText("gender").charAt(0);
            String email = element.elementText("email");
            contacts.add(new Contact(id, name, vipStr, gender, email));
        }

        contacts.forEach(System.out::println);
    }
}
