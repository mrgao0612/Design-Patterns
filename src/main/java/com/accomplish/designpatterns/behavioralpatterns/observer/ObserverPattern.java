package com.accomplish.designpatterns.behavioralpatterns.observer;

/**
 * 观察者模式客户端
 * @className ObserverPattern
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/5/5 12:58
 * @Version V1.0.0
 **/
public class ObserverPattern {
    public static void main(String[] args) {
        EventHandler eventHandler = new EventHandler();
        MouseA mouseA = new MouseA("老鼠A");
        eventHandler.addEvent(mouseA, "runAway", null);
        Subject cat = new Cat("猫来了", eventHandler);
        cat.notify2Observer();
    }
}
