package com.owl.dp.creatingpattern.factory.factorymethod;

/**
 * @author by 15515
 * @Classname PythonFactory
 * @Description TODO
 * @Date 2021/4/30 0:28
 **/
public class PythonVideoFactory implements VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
