package com.accomplish.designpatterns.structuralpatterns.composite;

/**
 * @className HRDepartment
 * @Description
 * @Author mrgao0612@gmail.com
 * @Date 2020/7/3 18:18
 * @Version V1.0.0
 **/
public class HRDepartment extends Company {
    public HRDepartment(String name) {
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
        System.out.printf("%s员工招聘培训管理\n", name);
    }
}
