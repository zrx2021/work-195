package xuan.homework2;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Demo1 {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document doc = reader.read(new File("day11-file-log-thread\\src\\xuan\\homework1\\book.xml"));

        Element rootElement = doc.getRootElement();
        List<Element> book = rootElement.elements("book");

        List<Book> books = new ArrayList<>();
        for (Element element : book) {
            String category = element.attributeValue("category");
            String name = element.elementText("name");
            String author = element.elementText("author");
            String year = element.elementText("year");
            String price = element.elementText("price");
            books.add(new Book(category, name, author, Integer.parseInt(year), Double.parseDouble(price)));
        }

        books.forEach(System.out::println);
    }
}
