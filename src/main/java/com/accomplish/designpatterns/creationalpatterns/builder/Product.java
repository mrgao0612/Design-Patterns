package com.accomplish.designpatterns.creationalpatterns.builder;

import lombok.Data;

/**
 * 产品角色
 * @className Product
 * @Description 包含多个组成部件的复杂对象
 * @Author mrgao0612@163.com
 * @Date 2020/4/10 21:51
 * @Version V1.0.0
 **/
@Data
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void show(){
        System.out.println(partA);
    }
}
