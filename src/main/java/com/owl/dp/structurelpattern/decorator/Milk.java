package com.owl.dp.structurelpattern.decorator;

/**
 * 牛奶
 *
 * @author owl
 * @date 2025/01/07
 */
public class Milk extends Decorator
{
    public Milk(Drink drink)
    {
        super(drink);
        setDescription("牛奶");
        setPrice(2.0f);
    }
}
