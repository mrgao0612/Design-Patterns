package com.accomplish.designpatterns.creationalpatterns.builder;

/**
 * 指挥者
 *
 * @className Director
 * @Description 调用建造者中的方法完成复杂对象的创建
 * @Author mrgao0612@163.com
 * @Date 2020/4/10 22:00
 * @Version V1.0.0
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构建与组装方法
     *
     * @param
     * @return com.accomplish.designpatterns.creationalpatterns.builder.Product
     * @author mrgao0612@163.com
     * @date 2020/4/10 22:03
     */
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
