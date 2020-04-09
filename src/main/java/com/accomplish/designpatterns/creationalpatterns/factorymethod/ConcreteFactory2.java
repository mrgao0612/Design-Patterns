package com.accomplish.designpatterns.creationalpatterns.factorymethod;

/**
 * @className ConcreteFactory2
 * @Description TODO
 * @Author mrgao0612@gmail.com
 * @Data 2020/4/9 14:04
 * @Version V1.0.0
 **/
public class ConcreteFactory2 implements AbstractFactory {
    public Product newProduct() {
        System.out.println("具体工厂2生产具体产品2：");
        return new ConcreteProduct2();
    }
}
