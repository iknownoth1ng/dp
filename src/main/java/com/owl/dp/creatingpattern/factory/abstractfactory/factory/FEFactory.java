package com.owl.dp.creatingpattern.factory.abstractfactory.factory;

import com.owl.dp.creatingpattern.factory.abstractfactory.product.Article;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.FEArticle;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.FEVideo;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.Video;

/**
 * @author by 15515
 * @Classname FEFactory
 * @Description TODO
 * @Date 2021/4/30 0:41
 **/
public class FEFactory implements Factory {

    @Override
    public Video getVideo() {
        return new FEVideo();
    }

    @Override
    public Article getArticle() {
        return new FEArticle();
    }
}
