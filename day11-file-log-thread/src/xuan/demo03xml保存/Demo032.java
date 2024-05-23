package xuan.demo03xml保存;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;

/*
目标:了解一下如何把程序中的的数据写出去到xml文件中

<?xml version="1.0" encoding="UTF-8" ?>
<book>
    <name>Java入门到精通</name>
    <author>传智播客</author>
    <price>59.9</price>
</book>
 */
public class Demo032 {
    public static void main(String[] args) throws IOException {
        // Document表示整个XML文件
        Document document = DocumentHelper.createDocument();

        // 添加根元素
        Element rootElement = document.addElement("book");

        // 使用根元素添加子元素
        rootElement.addElement("name").addText("Java入门到精通");
        rootElement.addElement("author").addText("传智播客");
        rootElement.addElement("price").addText("59.9");

        // 把document写到文件中
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(new FileWriter("day11-file-log-thread\\abc\\books2.xml"), outputFormat);
        writer.write(document);
        writer.close();
    }
}
