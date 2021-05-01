package com.owl.dp.creatingpattern.factory.abstractfactory.factory;

import com.owl.dp.creatingpattern.factory.abstractfactory.product.Article;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.JavaArticle;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.JavaVideo;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.Video;

/**
 * @author by 15515
 * @Classname JavaFactory
 * @Description TODO
 * @Date 2021/4/30 0:28
 **/
public class JavaFactory implements Factory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
