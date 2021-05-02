package com.owl.dp.creatingpattern.singleton;

/**
 * @author by 15515
 * @Classname SingletonTwo
 * @Description TODO 饿汉式-变种
 * @Date 2021/5/2 22:49
 **/
public class SingletonTwo {
    private static final SingletonTwo INSTANCE;

    static {
        INSTANCE = new SingletonTwo();
    }

    private SingletonTwo() {}

    private static SingletonTwo getInstance() {
        return INSTANCE;
    }

}
