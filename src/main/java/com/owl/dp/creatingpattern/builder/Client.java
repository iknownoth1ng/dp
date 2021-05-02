package com.owl.dp.creatingpattern.builder;

import com.owl.dp.creatingpattern.builder.builder.ASUSComputerBuilder;
import com.owl.dp.creatingpattern.builder.builder.Builder;
import com.owl.dp.creatingpattern.builder.builder.DellComputerBuilder;
import com.owl.dp.creatingpattern.builder.director.ComputerDirector;
import com.owl.dp.creatingpattern.builder.product.Computer;

/**
 * @author by 15515
 * @Classname Client
 * @Description TODO
 * @Date 2021/5/2 14:49
 **/
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       /* ComputerDirector director = new ComputerDirector();

        Builder asusBuilder = new ASUSComputerBuilder();
        Computer asusComputer = director.construct(asusBuilder);
        System.out.println(asusComputer.toString());

        Builder dellBuilder = new DellComputerBuilder();
        Computer dellComputer = director.construct(dellBuilder);
        System.out.println(dellComputer.toString());*/


        //可以通过反射机制和配置文件配合，创建具体建造者对象
        ComputerDirector director = new ComputerDirector();

        // 从数据库或者配置文件中读取具体建造者类名
        Class c = Class.forName("com.owl.dp.creatingpattern.builder.builder.ASUSComputerBuilder");
        Builder asusBuilder = (Builder) c.newInstance();
        Computer asusComputer = director.construct(asusBuilder);
        System.out.println(asusComputer.toString());
    }

}
