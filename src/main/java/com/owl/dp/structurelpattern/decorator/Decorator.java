package com.owl.dp.structurelpattern.decorator;

/**
 * 装饰器
 *
 * @author owl
 * @date 2025/01/07
 */
public class Decorator extends Drink
{
    private Drink drink;

    public Decorator(Drink drink)
    {
        this.drink = drink;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + "&&" + drink.getDescription();
    }

    @Override
    public double cost()
    {
        return super.getPrice() + drink.cost();
    }
}
