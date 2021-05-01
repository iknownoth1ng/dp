package com.owl.dp.creatingpattern.factory.abstractfactory.product;

/**
 * @author by 15515
 * @Classname PythonArticle
 * @Description TODO
 * @Date 2021/5/2 1:30
 **/
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("提供Python笔记");
    }
}
