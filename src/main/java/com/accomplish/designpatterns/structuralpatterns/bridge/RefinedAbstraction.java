package com.accomplish.designpatterns.structuralpatterns.bridge;

/**
 * 扩展抽象化角色
 *
 * @className RefinedAbstraction
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/13 21:37
 * @Version V1.0.0
 **/
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化（Refined Abstraction）角色被访问");
        implementor.operationImpl();
    }
}
