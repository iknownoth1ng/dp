package com.owl.dp.creatingpattern.singleton;

/**
 * @author by 15515
 * @Classname SingletonSeven
 * @Description TODO 静态内部类方法
 * @Date 2021/5/2 22:50
 **/
public class SingletonSeven {
    /*
    优点：避免了线程不安全，延迟加载，效率高。
    静态内部类的方式利用了类装载机制来保证线程安全，
    只有在第一次调用getInstance方法时，
    才会装载SingletonInstance内部类，完成Singleton的实例化，
    所以也有懒加载的效果。
     */

    private SingletonSeven() {

    }

    private static class SingletonInstance {
        private static final SingletonSeven INSTANCE = new SingletonSeven();
    }

    public static SingletonSeven getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
