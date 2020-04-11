package com.accomplish.designpatterns.structuralpatterns.proxy;

/**
 * 代理对象
 * @className Proxy
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/11 12:43
 * @Version V1.0.0
 **/
public class Proxy implements Subject {
    private RealSubject realSubject;
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }
    public void preRequest() {
        System.out.println("访问真实主题之前的预处理");
    }
    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理");
    }
}
