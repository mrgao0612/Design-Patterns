package com.accomplish.designpatterns.structuralpatterns.flyweight;

/**
 * 抽象享元角色
 * @className Flyweight
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/16 15:55
 * @Version V1.0.0
 **/
public interface Flyweight {
    void operation(UnsharedCoucreteFlyweight state);
}
