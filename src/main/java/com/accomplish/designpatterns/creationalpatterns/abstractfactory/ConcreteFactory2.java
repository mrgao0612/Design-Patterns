package com.accomplish.designpatterns.creationalpatterns.abstractfactory;

/**
 * @className ConcreteFactory2
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/9 22:29
 * @Version V1.0.0
 **/
public class ConcreteFactory2 implements AbstractoryFactory {

    public Product1 newProduct1() {
        System.out.println("具体工厂2生产产品12");
        return new ConcreteProduct12();
    }

    public Product2 newProduct2() {
        System.out.println("具体工厂2生产产品22");
        return new ConcreteProduct22();
    }
}
