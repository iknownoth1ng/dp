package com.owl.dp.creatingpattern.builder.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author by 15515
 * @Classname Computer
 * @Description TODO 产品角色
 * @Date 2021/5/2 14:33
 **/
@Getter
@Setter
@ToString
public class Computer {
    private String brand;
    private String cpu;
    private String mainBoard;
    private String hardDisk;
    private String displayCard;
    private String power;
    private String memory;
}
