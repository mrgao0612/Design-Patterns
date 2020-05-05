package com.accomplish.designpatterns.behavioralpatterns.observer;

/**
 * 具体主题
 * @className Cat
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/5/5 12:52
 * @Version V1.0.0
 **/
public class Cat implements Subject {
    private EventHandler eventHandler;

    public Cat(String subjectState, EventHandler eventHandler) {
        this.eventHandler = eventHandler;
        System.out.println(subjectState);
    }

    @Override
    public void notify2Observer() {
        eventHandler.notifyToObserver();
    }

}
