package com.accomplish.designpatterns.structuralpatterns.bridge;

/**
 * @className BridgeTest
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/13 21:41
 * @Version V1.0.0
 **/
public class BridgeTest {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
