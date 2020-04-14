package com.accomplish.designpatterns.structuralpatterns.facade;

/**
 * @className Facade
 * @Description
 * @Author mrgao0612@163.com
 * @Date 2020/4/14 22:22
 * @Version V1.0.0
 **/
public class Facade {
    private SubSystem01 system01 = new SubSystem01();
    private SubSystem02 system02 = new SubSystem02();

    /**
     * 外观角色方法
     */
    public void method() {
        system01.method1();
        system02.method2();
    }
}
