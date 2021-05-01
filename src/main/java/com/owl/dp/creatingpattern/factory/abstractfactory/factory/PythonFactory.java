package com.owl.dp.creatingpattern.factory.abstractfactory.factory;

import com.owl.dp.creatingpattern.factory.abstractfactory.product.Article;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.PythonArticle;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.PythonVideo;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.Video;

/**
 * @author by 15515
 * @Classname PythonFactory
 * @Description TODO
 * @Date 2021/4/30 0:28
 **/
public class PythonFactory implements Factory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
