package com.accomplish.designpatterns.behavioralpatterns.memento;

/**
 * 客户端
 * @className MementoMain
 * @Description
 * @Author mrgao0612@gmail.com
 * @Date 2020/7/3 11:30
 * @Version V1.0.0
 **/
public class MementoMain {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("ON");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("OFF");
        o.show();

        o.setMemento(c.getMemento());
        o.show();

    }
}
