package com.accomplish.designpatterns.creationalpatterns.factorymethod;

/**
 * @className ConcreteFactory1
 * @Description TODO
 * @Author mrgao0612@gmail.com
 * @Data 2020/4/9 14:02
 * @Version V1.0.0
 **/
public class ConcreteFactory1 implements AbstractFactory{
    public Product newProduct() {
        System.out.println("具体工厂1生产具体产品1：");
        return new ConcreteProduct1();
    }
}
