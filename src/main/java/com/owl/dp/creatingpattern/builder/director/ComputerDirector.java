package com.owl.dp.creatingpattern.builder.director;

import com.owl.dp.creatingpattern.builder.builder.Builder;
import com.owl.dp.creatingpattern.builder.product.Computer;

/**
 * @author by 15515
 * @Classname ComputerDirector
 * @Description TODO 指挥者
 * @Date 2021/5/2 14:46
 **/
public class ComputerDirector {
    public Computer construct(Builder builder) {
        // 逐步构建复杂产品对象
        Computer computer;
        builder.buildBrand();
        builder.buildCPU();
        builder.buildDisplayCard();
        builder.buildHardDisk();
        builder.buildMainBoard();
        builder.buildMemory();
        builder.buildPower();
        computer = builder.createComputer();
        return computer;
    }
}
