package xuan.homework2;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
有book.xml文档保存书籍信息，如下：
```xml
<?xml version="1.0" encoding="UTF-8"?>
<bookstore>
    <book category="Java">
        <name>Java入门到精通</name>
        <author>高司令</author>
        <year>2005</year>
        <price>29.99</price>
    </book>
    <book category="PHP">
        <name>PHP入门到放弃</name>
        <author>拉斯马斯·勒德尔夫</author>
        <year>2013</year>
        <price>8.88</price>
    </book>
</bookstore>
```
将其封装成List<Book>对象返回，并且输出集合中的每个元素。
Book类包含category, title, author, year, price这些属性。

 */
public class Test02 {
    public static void main(String[] args) throws IOException, DocumentException {
        // 2.创建解析器SAXReader对象
        SAXReader reader = new SAXReader();
        // 3.调用SAXReader对象的read方法得到document对象
        Document document = reader.read(new File("day11-work\\src\\com\\itheima\\base_text01\\book.xml"));
        // 4.通过Document得到根元素
        Element root = document.getRootElement();
        // 5.通过根标签得到所有book元素
        List<Element> books = root.elements("book");
        // 6.创建一个ArrayList,保存所有的Book对象
        List<Book> list = new ArrayList<>();

        // 7.遍历所有book元素得到每个book元素
        for (Element book : books) {
            // 8.在循环中通过book元素得到category的属性值
            String category = book.attributeValue("category");
            // 9.在循环中通过book元素得到子元素name,author,year,price的文本
            String title = book.elementText("name");
            String author = book.elementText("author");
            String yearStr = book.elementText("year");
            String priceStr = book.elementText("price");

            int year = Integer.parseInt(yearStr);
            double price = Double.parseDouble(priceStr);
            // 10.创建Book对象把解析的数据保存到Book对象中
            Book bookObj = new Book(category, title, author, year, price);
            // 11.把Book对象添加到ArrayList集合中
            list.add(bookObj);
        }

        // 12.输出所有书籍
        for (Book book : list) {
            System.out.println(book);
        }
    }
}