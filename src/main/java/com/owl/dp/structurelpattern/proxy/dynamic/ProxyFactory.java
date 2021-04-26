package com.owl.dp.structurelpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author by 15515
 * @Classname ProxyFactory
 * @Description TODO
 * @Date 2021/3/27 0:02
 **/
public class ProxyFactory {
    //维护一个目标对象，Objec
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk代理开始。。。");
                Object invoke = method.invoke(target, args);
                System.out.println("jdk代理提交。。。");
                return invoke;
            }
        });
    }
}
