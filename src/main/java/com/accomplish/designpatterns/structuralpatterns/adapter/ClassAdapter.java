package com.accomplish.designpatterns.structuralpatterns.adapter;

/**
 * @className ClassAdapter
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/13 20:53
 * @Version V1.0.0
 **/
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
