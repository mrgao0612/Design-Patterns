package com.accomplish.designpatterns.structuralpatterns.bridge;

/**
 * 抽象化角色
 *
 * @className Abstraction
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/13 21:34
 * @Version V1.0.0
 **/
public abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 操作
     */
    public abstract void operation();
}
