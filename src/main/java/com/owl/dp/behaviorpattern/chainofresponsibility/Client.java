package com.owl.dp.behaviorpattern.chainofresponsibility;

import com.owl.dp.behaviorpattern.chainofresponsibility.handler.CollegeApprover;
import com.owl.dp.behaviorpattern.chainofresponsibility.handler.DepartmentApprover;
import com.owl.dp.behaviorpattern.chainofresponsibility.handler.SchoolMasterApprover;
import com.owl.dp.behaviorpattern.chainofresponsibility.handler.ViceSchoolMasterApprover;
import com.owl.dp.behaviorpattern.chainofresponsibility.request.PurchaseRequest;

/**
 * @author by 15515
 * @Classname Client
 * @Description TODO
 * @Date 2021/4/1 0:03
 **/
public class Client {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(1, 31000, 1);
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("童校长");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);

        departmentApprover.processRequest(request);
    }
}
