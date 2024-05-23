package xuan.demo03xml保存;

import org.xml.sax.SAXException;

import java.io.BufferedWriter;
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
public class Demo031 {
    public static void main(String[] args) throws SAXException, IOException {
        // 使用一个StringBuilder对象来拼接XML格式的数据。
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
        sb.append("<book>\r\n");
        sb.append("\t<name>").append("Java入门到精通").append("</name>\r\n");
        sb.append("\t<author>").append("传智播客").append("</author>\r\n");
        sb.append("\t<price>").append(59.9).append("</price>\r\n");
        sb.append("</book>");

        try (
            BufferedWriter bw = new BufferedWriter(new FileWriter("day11-file-log-thread\\abc\\books.xml"));
        ){
            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
