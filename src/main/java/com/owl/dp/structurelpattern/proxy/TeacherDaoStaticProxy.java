package com.owl.dp.structurelpattern.proxy;

/**
 * 静态代理
 *
 * @author owl
 * @date 2025/02/28
 */
public class TeacherDaoStaticProxy implements ITeacherDao
{
    private ITeacherDao target;

    public TeacherDaoStaticProxy(ITeacherDao target)
    {
        this.target = target;
    }

    @Override
    public void teach()
    {
        System.out.println("静态代理开始");
        target.teach();
        System.out.println("静态代理结束");

    }
}
