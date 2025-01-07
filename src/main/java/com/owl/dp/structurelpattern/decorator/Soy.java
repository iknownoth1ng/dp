package com.owl.dp.structurelpattern.decorator;

/**
 * 豆浆
 *
 * @author owl
 * @date 2025/01/07
 */
public class Soy extends Decorator
{
    public Soy(Drink drink)
    {
        super(drink);
        setDescription("豆浆");
        setPrice(1.5f);
    }
}
