package com.accomplish.designpatterns.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件处理者
 * @className EventHandler
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/5/5 13:57
 * @Version V1.0.0
 **/
public class EventHandler {
    private List<Event> events;
    public EventHandler() {
        events = new ArrayList<>();
    }

    public void addEvent(Object object, String methodName, Object... args) {
        events.add(new Event(object, methodName, args));
    }

    public void notifyToObserver() {
        for (Event event : events) {
            event.invoke();
        }
    }
}
