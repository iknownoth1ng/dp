package com.owl.dp.creatingpattern.singleton;

import java.io.*;

/**
 * @author by 15515
 * @Classname SingletonOne
 * @Description TODO 饿汉式-线程安全
 * @Date 2021/5/2 22:49
 **/
public class SingletonOne {
    /*
    优点：简单，使用时没有延迟；在类装载时就完成实例化，天生的线程安全
    缺点：没有懒加载，启动较慢；如果从始至终都没使用过这个实例，则会造成内存的浪费。
    */

    private static final SingletonOne INSTANCE = new SingletonOne();

    private SingletonOne() {

    }

    private static SingletonOne getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 通过Java的序列化机制来攻击单例模式
        SingletonOne singleton = SingletonOne.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        // 序列化
        oos.writeObject(singleton);

        //// 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton_file"));
        SingletonOne newSingleton = (SingletonOne)ois.readObject();

        System.out.println(singleton);
        System.out.println(newSingleton);
        System.out.println(singleton == newSingleton);
    }
}
