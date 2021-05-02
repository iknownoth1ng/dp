package com.owl.dp.creatingpattern.singleton;

/**
 * @author by 15515
 * @Classname SingletonSix
 * @Description TODO 懒汉式 DLC
 * @Date 2021/5/2 22:50
 **/
public class SingletonSix {

    /* 优点：线程安全；延迟加载；效率较高。
    由于 JVM 具有指令重排的特性，
    在多线程环境下可能出现 singleton 已经赋值但还没初始化的情况，
    导致一个线程获得还没有初始化的实例。volatile 关键字的作用：
     - 保证了不同线程对这个变量进行操作时的可见性
     - 禁止进行指令重排序*/

    private static volatile SingletonSix instance;

    private SingletonSix() {}

    public static SingletonSix getInstance() {

        if (instance == null) {
            synchronized (SingletonFive.class) {
                if (instance == null) {
                    instance = new SingletonSix();
                }
            }
        }
        return instance;
    }
}
