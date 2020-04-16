package com.accomplish.designpatterns.structuralpatterns.flyweight;

/**
 * @className FlyweightPattern
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/16 16:10
 * @Version V1.0.0
 **/
public class FlyweightPattern {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01 = factory.getFlyweight("a");
        f01.operation(new UnsharedCoucreteFlyweight("第一次调用a"));
    }
}
