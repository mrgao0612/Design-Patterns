package com.accomplish.designpatterns.creationalpatterns.prototype;

import lombok.Data;

/**
 * @className Realizetype
 * @Description TODO
 * @Author mrgao0612@gmail.com
 * @Data 2020/4/9 10:48
 * @Version V1.0.0
 **/
@Data
public class RealizeType implements Cloneable {

    private String name;
    private Integer age;
    private String mobile;

    public RealizeType(String name, Integer age, String mobile) {
        System.out.println("具体原型创建成功");
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return super.clone();
    }

    @Override
    public String toString() {
        return name + age + mobile;
    }

}
