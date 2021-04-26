package com.owl.dp.behaviorpattern.chainofresponsibility.handler;

import com.owl.dp.behaviorpattern.chainofresponsibility.request.PurchaseRequest;

/**
 * @author by 15515
 * @Classname SchoolMasterApprover
 * @Description TODO
 * @Date 2021/3/31 23:58
 **/
public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest req) {
        if (req.getPrice() > 30000) {
            System.out.println("请求编号:" + req.getId() + "被" + this.name + "处理了，同意审批");
        } else {
            System.out.println(this.name + "处理不了,转交给" + approver.name + "处理");
            approver.processRequest(req);
        }
    }
}
