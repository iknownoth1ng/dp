package com.owl.dp.creatingpattern.factory.abstractfactory.factory;

import com.owl.dp.creatingpattern.factory.abstractfactory.product.Article;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.Video;

/**
 * @author 15515
 */
public interface Factory {
    /**
     * 获取Video
     *
     * @return
     * @Author: lxy
     * @Date: 2021/4/30 0:31
     * @Param [无]
     **/
    Video getVideo();

    /**
     * 获取笔记
     *
     * @return
     * @Author: lxy
     * @Date: 2021/4/30 0:31
     * @Param [无]
     **/
    Article getArticle();
}
