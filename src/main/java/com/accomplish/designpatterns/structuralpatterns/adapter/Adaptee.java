package com.accomplish.designpatterns.structuralpatterns.adapter;

/**
 * 适配者接口
 *
 * @className Adaptee
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/13 20:50
 * @Version V1.0.0
 **/
public class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用");
    }
}
