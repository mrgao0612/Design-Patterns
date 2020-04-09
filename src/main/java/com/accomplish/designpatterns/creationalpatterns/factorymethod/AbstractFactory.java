package com.accomplish.designpatterns.creationalpatterns.factorymethod;

/**
 * 抽象工厂，提供产品生产的方法
 *
 * @className AbstractFactory
 * @Description
 * @Author mrgao0612@gmail.com
 * @Data 2020/4/9 13:55
 * @Version V1.0.0
 **/
public interface AbstractFactory {

    /**
     * 生产产品
     * @return Product
     */
    Product newProduct();
}
