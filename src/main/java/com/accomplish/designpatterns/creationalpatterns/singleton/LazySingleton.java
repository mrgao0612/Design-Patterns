package com.accomplish.designpatterns.creationalpatterns.singleton;

/**
 * 懒汉单例模式
 *
 * @className LazySingleton
 * @Description 注意，如果编写的是多线程程序，则不要删除代码中的关键字volatile和synchronized，否则存在线程非安全的问题。
 * 如果不删除这两个关键字就能保证线程安全，但是每次访问都要同步，会影响性能，且消耗更多的资源。
 * @Author mrgao0612@163.com
 * @Date 2020/4/8 21:51
 * @Version V1.0.0
 **/
public class LazySingleton {
    /**
     * 保证instance在所有线程中同步
     */
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
