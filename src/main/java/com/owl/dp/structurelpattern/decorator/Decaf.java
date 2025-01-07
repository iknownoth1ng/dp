package com.owl.dp.structurelpattern.decorator;

/**
 * 无咖啡因
 *
 * @author owl
 * @date 2025/01/07
 */
public class Decaf extends Coffee
{
    public Decaf()
    {
        setDescription("无咖啡因");
        setPrice(2.0f);
    }
}
