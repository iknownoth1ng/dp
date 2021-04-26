package com.owl.dp.behaviorpattern.chainofresponsibility.request;

/**
 * @author by 15515
 * @Classname PurchaseRequest
 * @Description TODO
 * @Date 2021/3/31 23:41
 **/
public class PurchaseRequest {
    //请求类型
    private int type = 0;
    private float price = 0.0f;
    private int id = 0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
