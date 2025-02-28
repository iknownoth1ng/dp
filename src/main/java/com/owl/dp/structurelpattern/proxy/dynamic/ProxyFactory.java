package com.owl.dp.structurelpattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 *
 * @author owl
 * @date 2025/02/28
 */
public class ProxyFactory
{
    // 维护一个目标对象，Objec
    private Object target;

    public ProxyFactory(Object target)
    {
        this.target = target;
    }

    public Object getProxyInstance()
    {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("jdk代理开始。。。");
            Object invoke = method.invoke(target, args);
            System.out.println("jdk代理提交。。。");
            return invoke;
        });
    }
}
