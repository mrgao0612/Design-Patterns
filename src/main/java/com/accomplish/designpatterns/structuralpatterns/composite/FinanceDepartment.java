package com.accomplish.designpatterns.structuralpatterns.composite;

/**
 * @className FinanceDepartment
 * @Description
 * @Author mrgao0612@gmail.com
 * @Date 2020/7/3 18:36
 * @Version V1.0.0
 **/
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        print(depth);
    }

    @Override
    public void lineOfDuty() {
        System.out.printf("%s公司财务收支管理\n", name);
    }


}
