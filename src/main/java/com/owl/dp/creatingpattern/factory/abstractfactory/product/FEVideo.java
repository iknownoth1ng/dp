package com.owl.dp.creatingpattern.factory.abstractfactory.product;

import com.owl.dp.creatingpattern.factory.abstractfactory.product.Video;

/**
 * @author by 15515
 * @Classname FEVideo
 * @Description TODO
 * @Date 2021/4/30 0:40
 **/
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("生成FEvideo视频");
    }
}
