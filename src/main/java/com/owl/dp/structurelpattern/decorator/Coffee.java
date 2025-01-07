package com.owl.dp.structurelpattern.decorator;

/**
 * 咖啡
 *
 * @author owl
 * @date 2025/01/07
 */
public class Coffee extends Drink
{
    @Override
    public double cost()
    {
        return super.getPrice();
    }
}
