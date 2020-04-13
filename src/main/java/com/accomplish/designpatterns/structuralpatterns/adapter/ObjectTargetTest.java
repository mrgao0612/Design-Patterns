package com.accomplish.designpatterns.structuralpatterns.adapter;

/**
 * @className ObjectTargetTest
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/13 20:59
 * @Version V1.0.0
 **/
public class ObjectTargetTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
