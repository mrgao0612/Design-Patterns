package com.accomplish.designpatterns.behavioralpatterns.memento;

/**
 * 发起人
 * @className Originator
 * @Description
 * @Author mrgao0612@gmail.com
 * @Date 2020/7/3 11:22
 * @Version V1.0.0
 **/
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show() {
        System.out.println("State " + state);
    }
}
