package com.owl.dp.behaviorpattern.chainofresponsibility.handler;

import com.owl.dp.behaviorpattern.chainofresponsibility.request.PurchaseRequest;

/**
 * @author by 15515
 * @Classname Approver
 * @Description TODO
 * @Date 2021/3/31 23:44
 **/
public abstract class Approver {
    //下一个处理者
    public Approver approver;
    //名字
    public String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理审批请求的方法，得到一个请求，处理是子类完成，因此该方法做成抽象
    public abstract void processRequest(PurchaseRequest req);
}
