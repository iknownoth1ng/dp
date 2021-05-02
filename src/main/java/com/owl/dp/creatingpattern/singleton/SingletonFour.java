package com.owl.dp.creatingpattern.singleton;

/**
 * @author by 15515
 * @Classname SingletonFour
 * @Description TODO 懒汉式-线程安全
 * @Date 2021/5/2 22:49
 **/
public class SingletonFour {
    /*
    优点：解决了上一种实现方式的线程不安全问题
    缺点：synchronized 对整个 getInstance() 方法都进行了同步，每次只有一个线程能够进入该方法，并发性能极差
     */

    private static SingletonFour instance;

    private SingletonFour() {}

    public static synchronized SingletonFour getInstance() {
        if (instance == null) {
            instance = new SingletonFour();
        }
        return instance;
    }
}
