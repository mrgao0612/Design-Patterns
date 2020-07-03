package com.accomplish.designpatterns.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @className ConcreteCompany
 * @Description
 * @Author mrgao0612@gmail.com
 * @Date 2020/7/3 17:58
 * @Version V1.0.0
 **/
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();
    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        print(depth);
        for (Company c : children) {
            c.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company component : children) {
            component.lineOfDuty();
        }
    }

}
