package com.accomplish.designpatterns.creationalpatterns.abstractfactory;

import com.accomplish.designpatterns.creationalpatterns.factorymethod.Product;

/**
 * 抽象工厂
 * @className AbstractoryFactory
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/9 22:15
 * @Version V1.0.0
 **/
public interface AbstractoryFactory {
    /**
     * 生产产品1
     * @return
     */
    Product1 newProduct1();

    /**
     * 生产产品2
     * @return
     */
    Product2 newProduct2();

}
