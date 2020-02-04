package com.xuningchuan.demo.designpatterns.responsibilitychain;

/**
 * @author xuningchuan
 * @Title: Manager
 * @Description:
 * @date 2020-02-0416:17
 */
public class Manager extends ApprovalHandler{

    @Override
    public void process(int day) {
        if (day <= ApprovalHandler.MANAGER_DAY) {
            System.out.println("Manager 已审批");
        }else{
            System.out.println("目前不可审批");
        }
    }

}
