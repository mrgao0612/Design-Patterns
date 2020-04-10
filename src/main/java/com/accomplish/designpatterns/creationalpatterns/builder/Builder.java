package com.accomplish.designpatterns.creationalpatterns.builder;

/**
 * 抽象建造者
 * @className Builder
 * @Description 包含创建产品各个子部件的抽象方法
 * @Author mrgao0612@163.com
 * @Date 2020/4/10 21:54
 * @Version V1.0.0
 **/
public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}
