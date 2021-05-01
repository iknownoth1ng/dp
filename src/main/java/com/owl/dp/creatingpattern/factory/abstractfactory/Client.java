package com.owl.dp.creatingpattern.factory.abstractfactory;

import com.owl.dp.creatingpattern.factory.abstractfactory.factory.Factory;
import com.owl.dp.creatingpattern.factory.abstractfactory.factory.JavaFactory;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.Article;
import com.owl.dp.creatingpattern.factory.abstractfactory.product.Video;

/**
 * @author by 15515
 * @Classname Client
 * @Description TODO
 * @Date 2021/5/2 1:34
 **/
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //客户端只需要指定具体工厂，就可以获取该工厂生产的一族产品
        Factory javaFactory = new JavaFactory();
        Video javaVideo = javaFactory.getVideo();
        javaVideo.produce();
        Article javaArticle = javaFactory.getArticle();
        javaArticle.produce();
        //也可以利用反射机制和配置文件，当需要修改具体工厂的时候就不需要修改客户端代码，只改配置文件即可
        // 从配置文件或数据库等外部渠道获取具体工厂类名
        String factoryName = "com.owl.dp.creatingpattern.factory.abstractfactory.factory.PythonFactory";
        // 通过反射机制获取工厂类
        Class c = Class.forName(factoryName);
        Factory courseFactory = (Factory) c.newInstance();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
