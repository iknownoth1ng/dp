package com.owl.dp.structurelpattern.decorator;

/**
 * 巧克力
 *
 * @author owl
 * @date 2025/01/07
 */
public class Chocolate extends Decorator
{
    public Chocolate(Drink drink)
    {
        super(drink);
        setDescription("巧克力");
        setPrice(3.0f);
    }
}
