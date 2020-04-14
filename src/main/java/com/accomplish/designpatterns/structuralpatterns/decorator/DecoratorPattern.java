package com.accomplish.designpatterns.structuralpatterns.decorator;

/**
 * @className DecoratorPattern
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/14 21:28
 * @Version V1.0.0
 **/
public class DecoratorPattern {
    public static void main(String[] args) {
        Component component = new ConcreteDecorator(new ConcreteComponent());
        component.operation();
    }
}
