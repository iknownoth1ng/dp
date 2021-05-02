package com.owl.dp.creatingpattern.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * @author by 15515
 * @Classname Mail
 * @Description TODO ConcretePrototype
 * @Date 2021/5/2 15:38
 **/
@Setter
@Getter
public class Mail implements Cloneable {
    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail Class Constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
