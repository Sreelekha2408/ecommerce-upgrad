package DataFormatting;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLParsingClass {
    public static void main(String[] args) {
        File file = new File("/Users/sreelekha/Study/Practice/src/DataFormatting/file.xml");
        DocumentBuilderFactory check = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder doc = check.newDocumentBuilder();
            Document d1 = doc.parse(file);
            System.out.println(d1.getDocumentElement().getNodeName());
            NodeList nodes = d1.getElementsByTagName("student");
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                System.out.println(node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println(element.getAttribute("rollNo"));
                    System.out.println(element.getElementsByTagName("firstname").item(0).getTextContent());
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
