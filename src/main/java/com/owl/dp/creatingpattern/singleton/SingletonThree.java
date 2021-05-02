package com.owl.dp.creatingpattern.singleton;

/**
 * @author by 15515
 * @Classname SingletonThree
 * @Description TODO 懒汉式
 * @Date 2021/5/2 22:49
 **/
public class SingletonThree {
    /*
    优点：懒加载，启动速度快、如果从始至终都没使用过这个实例，则不会初始化该实力，可节约资源
    缺点：多线程环境下线程不安全。if (singleton == null) 存在竞态条件，可能会有多个线程同时进入 if 语句，导致产生多个实例
    */

    private static SingletonThree instance;

    private SingletonThree() {}

    private static SingletonThree getInstance() {
        if (instance == null) {
            instance = new SingletonThree();
        }
        return instance;
    }

}
