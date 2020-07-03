package com.accomplish.designpatterns.structuralpatterns.composite;

/**
 * @className Company
 * @Description
 * @Author mrgao0612@gmail.com
 * @Date 2020/7/3 17:53
 * @Version V1.0.0
 **/
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 添加
     * @param c
     */
    public abstract void add(Company c);

    /**
     * 移除
     * @param c
     */
    public abstract void remove(Company c);

    /**
     * 展示
     * @param depth
     */
    public abstract void display(int depth);

    /**
     * 职责
     */
    public abstract void lineOfDuty();

    public void print(int depth) {
        String c = "";
        for (int i = 0; i < depth; i++) {
            c = c + "-";
        }
        System.out.println(c + name);
    }
}
