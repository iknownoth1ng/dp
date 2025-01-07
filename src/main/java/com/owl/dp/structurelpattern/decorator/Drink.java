package com.owl.dp.structurelpattern.decorator;

/**
 * 饮料
 *
 * @author owl
 * @date 2025/01/07
 */
public abstract class Drink
{
    private String description;
    private float price = 0.0F;

    public String getDescription()
    {
        return description + ":" + price;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getPrice()
    {
        return price;
    }


    public void setPrice(float price)
    {
        this.price = price;
    }

    // 计算费用的抽象方法
    public abstract double cost();
}
