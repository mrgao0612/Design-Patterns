package com.accomplish.designpatterns.creationalpatterns.abstractfactory;

/**
 * @className ConcreteFactory1
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/9 22:23
 * @Version V1.0.0
 **/
public class ConcreteFactory1 implements AbstractoryFactory {
    public Product1 newProduct1() {
        System.out.println("具体工厂1生产产品11");
        return new ConcreteProduct11();
    }

    public Product2 newProduct2() {
        System.out.println("具体工厂1生产产品21");
        return new ConcreteProduct21();
    }
}
