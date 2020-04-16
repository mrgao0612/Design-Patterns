package com.accomplish.designpatterns.structuralpatterns.flyweight;

/**
 * 非享元模式
 *
 * @className UnsharedCoucreteFlyweight
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/16 15:48
 * @Version V1.0.0
 **/
public class UnsharedCoucreteFlyweight {
    private String info;

    UnsharedCoucreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
