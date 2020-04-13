package com.accomplish.designpatterns.structuralpatterns.bridge;

/**
 * 具体实现化角色
 * @className ConcreteImplementorA
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/13 21:32
 * @Version V1.0.0
 **/
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现化（Concrete Implementor）角色被访问");
    }
}
