package com.accomplish.designpatterns.structuralpatterns.composite;

/**
 * @className CompositeMain
 * @Description
 * @Author mrgao0612@gmail.com
 * @Date 2020/7/3 18:22
 * @Version V1.0.0
 **/
public class CompositeMain {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));
        root.display(1);
        root.lineOfDuty();
    }
}
