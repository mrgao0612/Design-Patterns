package com.accomplish.designpatterns.structuralpatterns.adapter;

/**
 * 对象适配类
 *
 * @className ObjectAdapter
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/13 20:56
 * @Version V1.0.0
 **/
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
        ;
    }
}
