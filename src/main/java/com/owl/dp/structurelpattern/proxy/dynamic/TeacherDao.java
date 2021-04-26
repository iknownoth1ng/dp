package com.owl.dp.structurelpattern.proxy.dynamic;

/**
 * @author by 15515
 * @Classname TeacherDao
 * @Description TODO
 * @Date 2021/3/27 0:02
 **/
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师正在授课中。。。");
    }
}
