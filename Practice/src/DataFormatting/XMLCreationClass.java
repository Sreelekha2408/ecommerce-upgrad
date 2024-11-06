package DataFormatting;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLCreationClass {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element rootElement = doc.createElement("cars");
            doc.appendChild(rootElement);
            rootElement.setAttribute("company", "ferrari");
            Element subElement =  doc.createElement("speed");
            rootElement.appendChild(subElement);
            subElement.setTextContent("200miles/hr");
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("/Users/sreelekha/Study/Practice/src/DataFormatting/output.xml"));
            transformer.transform(source, result);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
