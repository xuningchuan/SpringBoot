package com.xuningchuan.demo.designpatterns.responsibilitychain;

/**
 * @author xuningchuan
 * @Title: ApprovalHandlerFactory
 * @Description:
 * @date 2020-02-0416:37
 */
public class ApprovalHandlerFactory {

    public static ApprovalHandler createApprovalHandler(){
        Leader leader = new Leader();
        Manager manager = new Manager();

        leader.setNextHandler(manager);
        return leader;
    }
}
