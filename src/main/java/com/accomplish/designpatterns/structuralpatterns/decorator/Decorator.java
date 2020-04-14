package com.accomplish.designpatterns.structuralpatterns.decorator;

/**
 * 抽象装饰角色
 * @className Decorator
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/14 21:22
 * @Version V1.0.0
 **/
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
