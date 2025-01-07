package com.owl.dp.structurelpattern.decorator;

import org.junit.Test;

/**
 * 测试装饰器
 *
 * @author owl
 * @date 2025/01/07
 */
public class TestDecorator
{
    @Test
    public void test()
    {
        // 2份巧克力+1份牛奶的 longblack
        Drink longblack = new LongBlack();
        Drink order = new Milk(new Chocolate(new Chocolate(longblack)));
        System.out.println(order.getDescription());
        System.out.println(order.cost());
    }
}
