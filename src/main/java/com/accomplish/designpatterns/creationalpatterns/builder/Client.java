package com.accomplish.designpatterns.creationalpatterns.builder;

/**
 * @className Client
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/10 22:04
 * @Version V1.0.0
 **/
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
