package com.owl.dp.creatingpattern.builder.builder;

import com.owl.dp.creatingpattern.builder.product.Computer;

/**
 * 抽象建造者
 *
 * @author 15515
 */
public abstract class Builder {
    public Computer computer = new Computer();

    /**
     * 构建品牌
     */
    public abstract void buildBrand();

    /**
     * 构建CPU
     */
    public abstract void buildCPU();

    /**
     * 构建主板
     */
    public abstract void buildMainBoard();

    /**
     * 构建硬盘
     */
    public abstract void buildHardDisk();

    /**
     * 构建显卡
     */
    public abstract void buildDisplayCard();

    /**
     * 构建电源
     */
    public abstract void buildPower();

    /**
     * 构建内存
     */
    public abstract void buildMemory();

    public Computer createComputer() {
        return computer;
    }
}
