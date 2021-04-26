package com.owl.dp.structurelpattern.proxy.dynamic;

/**
 * @author by 15515
 * @Classname Client
 * @Description TODO
 * @Date 2021/3/27 0:52
 **/
public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
