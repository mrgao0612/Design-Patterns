package com.accomplish.designpatterns.behavioralpatterns.memento;

/**
 * 管理者
 * @className Caretaker
 * @Description
 * @Author mrgao0612@gmail.com
 * @Date 2020/7/3 11:29
 * @Version V1.0.0
 **/
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
