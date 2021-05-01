package com.owl.dp.creatingpattern.factory.abstractfactory.product;

import com.owl.dp.creatingpattern.factory.abstractfactory.product.Video;

/**
 * @author by 15515
 * @Classname PythonVideo
 * @Description TODO ConcreteProduct（具体产品角色）
 * @Date 2021/4/29 0:29
 **/
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("生成Python视频");
    }
}
