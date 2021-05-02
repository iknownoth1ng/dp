package com.owl.dp.creatingpattern.singleton;

/**
 * @author by 15515
 * @Classname SingletonFive
 * @Description TODO 懒汉式-线程不安全
 * @Date 2021/5/2 22:49
 **/
public class SingletonFive {
    private static volatile SingletonFive instance;

    private SingletonFive() {}

    public static SingletonFive getInstance() {

        if (instance == null) {
            // 妄图提升效率，但是线程不安全
            synchronized (SingletonFive.class) {
                instance = new SingletonFive();
            }
        }
        return instance;
    }
}
