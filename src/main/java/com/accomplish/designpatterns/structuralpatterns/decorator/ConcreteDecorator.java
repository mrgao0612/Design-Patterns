package com.accomplish.designpatterns.structuralpatterns.decorator;

/**
 * 具体装饰角色
 *
 * @className ConcreteDecorator
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/14 21:24
 * @Version V1.0.0
 **/
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
