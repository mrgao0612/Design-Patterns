package com.accomplish.designpatterns.behavioralpatterns.observer;

/**
 * 具体观察者A
 * @className MouseA
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/5/5 12:39
 * @Version V1.0.0
 **/
public class MouseA {

    private String name;

    public MouseA(String name) {
        this.name = name;
    }

    public void runAway() {
        System.out.printf("%s跑了！", this.name);
    }
}
