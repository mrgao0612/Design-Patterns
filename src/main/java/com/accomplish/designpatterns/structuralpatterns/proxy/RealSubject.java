package com.accomplish.designpatterns.structuralpatterns.proxy;

/**
 * 真实主题
 * @className RealSubject
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/11 12:40
 * @Version V1.0.0
 **/
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法");
    }
}
