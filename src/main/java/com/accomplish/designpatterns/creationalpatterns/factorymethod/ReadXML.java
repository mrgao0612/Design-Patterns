package com.accomplish.designpatterns.creationalpatterns.factorymethod;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;

/**
 * @className ReadXML
 * @Description TODO
 * @Author mrgao0612@gmail.com
 * @Data 2020/4/9 14:14
 * @Version V1.0.0
 **/
public class ReadXML<T> {
    public T getObejct() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("factoryConfig.xml");
            Document document = builder.parse(inputStream);
            NodeList nodeList = document.getElementsByTagName("classPath");
            Node node = nodeList.item(0).getFirstChild();
            String cName = node.getNodeValue();
            Class<?> clazz = Class.forName(cName);
            return (T) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
