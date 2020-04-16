package com.accomplish.designpatterns.structuralpatterns.flyweight;

/**
 * 具体享元角色
 * @className ConcreteFlyweight
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/16 15:57
 * @Version V1.0.0
 **/
public class ConcreteFlyweight implements Flyweight {
    private String key;

    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建");
    }

    @Override
    public void operation(UnsharedCoucreteFlyweight state) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是：" + state.getInfo());
    }
}
