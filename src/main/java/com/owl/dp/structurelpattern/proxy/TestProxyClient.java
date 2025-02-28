package com.owl.dp.structurelpattern.proxy;

import com.owl.dp.structurelpattern.proxy.dynamic.CglibProxyFactory;
import com.owl.dp.structurelpattern.proxy.dynamic.ProxyFactory;
import org.junit.jupiter.api.Test;

/**
 * 测试代理客户端
 * <p>
 * --add-opens java.base/java.lang=ALL-UNNAMED
 *
 * @author by 15515
 * @date 2025/02/28
 */
public class TestProxyClient
{
    @Test
    public void testStaticProxy()
    {
        ITeacherDao target = new TeacherDaoImpl();
        TeacherDaoStaticProxy teacherDaoStaticProxy = new TeacherDaoStaticProxy(target);
        teacherDaoStaticProxy.teach();
    }

    @Test
    public void testDynamicProxy()
    {
        ITeacherDao target = new TeacherDaoImpl();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();
        // proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("proxyInstance=" + proxyInstance.getClass());
        proxyInstance.teach();
    }

    @Test
    public void testCglibProxy()
    {
        // 创建目标对象
        TeacherDao target = new TeacherDao();
        // 获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new CglibProxyFactory(target).getProxyInstance();

        // 执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
        String res = proxyInstance.teach();
        System.out.println("res=" + res);
    }
}
