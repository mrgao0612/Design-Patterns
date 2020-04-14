package com.accomplish.designpatterns.structuralpatterns.decorator;

/**
 * 具体构件角色
 * @className ConcreteComponent
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/14 21:17
 * @Version V1.0.0
 **/
public class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }
    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
