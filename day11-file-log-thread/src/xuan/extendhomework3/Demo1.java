package xuan.extendhomework3;

import org.dom4j.CDATA;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read(new File("day11-file-log-thread\\src\\xuan\\extendhomework3\\order.xml"));
            Element rootElement = doc.getRootElement();

            System.out.println("id = " + rootElement.elementText("id"));
            System.out.println("date = " + rootElement.elementText("date"));
            System.out.println(rootElement.elementText("remarks"));

            Element receiver = rootElement.element("receiver");
            Element items = rootElement.element("items");

            System.out.println(receiver.elementText("name"));
            System.out.println(receiver.elementText("address"));

            List<Element> elements = items.elements();
            for (Element element : elements) {
                System.out.println(element.elementText("name"));
                System.out.println(element.elementText("price"));
                System.out.println(element.elementText("quantity"));
            }
        } catch (DocumentException e) {
            System.out.println("文件异常");
        }
    }
}
