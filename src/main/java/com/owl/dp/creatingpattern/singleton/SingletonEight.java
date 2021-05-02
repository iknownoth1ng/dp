package com.owl.dp.creatingpattern.singleton;

/**
 * 枚举类写法
 * 
 * @author by 15515
 * @Classname SingletonEight
 * @Date 2021/5/2 22:50
 **/
public enum SingletonEight {
    // 线程安全

    // 优点：通过JDK1.5中添加的枚举来实现单例模式，写法简单，且不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
    /*
    1.使用new关键字创建对象
    2.使用Class类的newInstance方法(反射机制)
    3.使用Constructor类的newInstance方法(反射机制)
    4.使用Clone方法创建对象
    5.使用(反)序列化机制创建对象
     */
    INSTANCE;

    public void whateverMethod() {}
}
