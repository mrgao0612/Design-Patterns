package com.accomplish.designpatterns.creationalpatterns.builder;

/**
 * 具体建造者
 *
 * @className ConcreteBuilder
 * @Description 实现了抽象建造者接口
 * @Author mrgao0612@163.com
 * @Date 2020/4/10 21:57
 * @Version V1.0.0
 **/
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造PartC");
    }
}
