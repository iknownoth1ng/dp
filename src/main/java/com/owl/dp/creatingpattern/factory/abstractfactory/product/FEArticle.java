package com.owl.dp.creatingpattern.factory.abstractfactory.product;

/**
 * @author by 15515
 * @Classname FEArticle
 * @Description TODO
 * @Date 2021/5/2 1:31
 **/
public class FEArticle extends Article {
    @Override
    public void produce() {
        System.out.println("提供FE笔记");
    }
}
