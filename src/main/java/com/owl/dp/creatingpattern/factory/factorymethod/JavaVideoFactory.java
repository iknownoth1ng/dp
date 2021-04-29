package com.owl.dp.creatingpattern.factory.factorymethod;

/**
 * @author by 15515
 * @Classname JavaVideoFactory
 * @Description TODO
 * @Date 2021/4/30 0:28
 **/
public class JavaVideoFactory implements VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
