package com.owl.dp.creatingpattern.factory.simplefactory;

/**
 * @author by 15515
 * @Classname Factory
 * @Description TODO Factory（工厂角色）
 * @Date 2021/4/29 0:29
 **/
public class VideoFactory {
    /**
     * 使用if else 判断类型，type 为 Java 则返回 JavaVideo， type为Python则返回 PythonVideo
     */
    public static Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        }
        if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        System.out.println("输入类型错误");
        return null;
    }

    /**
     * 使用反射来创建对象
     */
    public static Video getVideo(Class cls) {
        Video video = null;
        try {
            video = (Video) Class.forName(cls.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
