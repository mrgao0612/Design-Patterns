package com.accomplish.designpatterns.creationalpatterns.factorymethod;

/**
 * @className FactoryMethod
 * @Description TODO
 * @Author mrgao0612@gmail.com
 * @Data 2020/4/9 14:26
 * @Version V1.0.0
 **/
public class FactoryMethod {
    public static void main(String[] args) {
        Product product;
        ReadXML<AbstractFactory> readXML = new ReadXML<AbstractFactory>();
        AbstractFactory factory = readXML.getObejct();
        product = factory.newProduct();
        product.show();
    }
}
