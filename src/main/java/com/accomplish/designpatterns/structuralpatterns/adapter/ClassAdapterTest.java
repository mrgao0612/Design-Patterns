package com.accomplish.designpatterns.structuralpatterns.adapter;

/**
 * @className ClassAdapterTest
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/13 20:55
 * @Version V1.0.0
 **/
public class ClassAdapterTest {
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}
