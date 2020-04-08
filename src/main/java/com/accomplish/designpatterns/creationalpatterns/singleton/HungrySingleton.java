package com.accomplish.designpatterns.creationalpatterns.singleton;

/**
 * 饿汉单例模式
 *
 * @className HungrySingleton
 * @Description 饿汉式单例在类创建的同时就创建好一个静态的对象供系统使用，
 * 以后不会改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
 * @Author mrgao0612@163.com
 * @Date 2020/4/8 22:02
 * @Version V1.0.0
 **/
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
