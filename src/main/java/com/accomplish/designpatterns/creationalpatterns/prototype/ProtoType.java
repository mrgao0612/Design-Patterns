package com.accomplish.designpatterns.creationalpatterns.prototype;

/**
 * @className ProtoType
 * @Description TODO
 * @Author mrgao0612@gmail.com
 * @Data 2020/4/9 10:54
 * @Version V1.0.0
 **/
public class ProtoType {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType obj1 = new RealizeType("Jack", 23, "2233");
        RealizeType obj2 = (RealizeType) obj1.clone();
        obj2.setName("Rose");
        System.out.println(obj2.toString());
    }
}
