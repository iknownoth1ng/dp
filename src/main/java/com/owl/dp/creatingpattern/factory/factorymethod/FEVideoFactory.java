package com.owl.dp.creatingpattern.factory.factorymethod;

/**
 * @author by 15515
 * @Classname FEVideoFactory
 * @Description TODO
 * @Date 2021/4/30 0:41
 **/
public class FEVideoFactory implements VideoFactory {

    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
