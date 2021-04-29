package com.owl.dp.creatingpattern.factory.factorymethod;

/**
 * @author by 15515
 * @Classname Client
 * @Description TODO
 * @Date 2021/4/30 0:38
 **/
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //客户端类，需要什么产品则通过该产品对应的工厂类来获取，不需要知道具体的创建过程
        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        Video pythonVideo = pythonVideoFactory.getVideo();
        pythonVideo.produce();
        Video javaVideo = javaVideoFactory.getVideo();
        javaVideo.produce();
        //当需要增加一个产品 FEVideo 时，只需要增加 FEVideo 具体产品类和 FEVideoFactory 具体工厂类即可，不需要修改原有的产品类和工厂类
        FEVideoFactory feVideoFactory = new FEVideoFactory();
        Video feVideo = feVideoFactory.getVideo();
        feVideo.produce();
        //还可以通过反射机制和配置文件配合，连客户端代码都不需要修改
        // 从文件或数据库等外部渠道获取 工厂类名
        String factoryName = " com.owl.dp.creatingpattern.factory.factorymethod.JavaVideoFactory";
        // 通过反射机制获取工厂类
        Class c = Class.forName(factoryName);
        VideoFactory factory = (VideoFactory) c.newInstance();
        // 生产产品
        Video video = factory.getVideo();
        video.produce();
    }
}
