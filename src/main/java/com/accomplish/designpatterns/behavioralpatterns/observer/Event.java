package com.accomplish.designpatterns.behavioralpatterns.observer;

import java.lang.reflect.Method;

/**
 * 事件对象
 * @className Event
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/5/5 13:39
 * @Version V1.0.0
 **/
public class Event {
    private Object object;
    private String methodName;
    private Object[] params;
    private Class[] paramTypes;
    public Event(Object object, String methodName, Object... args) {
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        contractParamTypes(args);
    }

    private void contractParamTypes(Object[] params) {
        if (params == null) {
            return;
        }
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke() {
        try {
            Method method = this.object.getClass().getMethod(this.methodName, this.paramTypes);
            if (method == null) {
                return;
            }
            method.invoke(this.object, this.params);
        } catch (Exception e) {
            System.out.printf("调用观察者事件方法失败,原因[%s]",e.getCause());
        }
    }
}
