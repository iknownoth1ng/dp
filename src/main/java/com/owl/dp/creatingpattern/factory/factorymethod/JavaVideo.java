package com.owl.dp.creatingpattern.factory.factorymethod;

/**
 * @author by 15515
 * @Classname JavaVideo
 * @Description TODO ConcreteProduct（具体产品角色）
 * @Date 2021/4/29 0:29
 **/
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("生成Java视频");
    }
}
