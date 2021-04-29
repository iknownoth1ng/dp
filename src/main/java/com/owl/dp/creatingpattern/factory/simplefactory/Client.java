package com.owl.dp.creatingpattern.factory.simplefactory;

/**
 * @author by 15515
 * @Classname Client
 * @Description TODO
 * @Date 2021/4/29 0:38
 **/
public class Client {
    public static void main(String[] args) {
        //使用发射
        Video video = VideoFactory.getVideo(JavaVideo.class);
        video.produce();
        //使用类型
        Video python = VideoFactory.getVideo("python");
        python.produce();
    }
}
