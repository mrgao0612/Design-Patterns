package com.accomplish.designpatterns.behavioralpatterns.memento;

/**
 * 备忘录
 * @className Memento
 * @Description
 * @Author mrgao0612@gmail.com
 * @Date 2020/7/3 11:23
 * @Version V1.0.0
 **/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
