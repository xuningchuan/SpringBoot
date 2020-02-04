package com.xuningchuan.demo.designpatterns.responsibilitychain;

/**
 * @author xuningchuan
 * @Title: Leader
 * @Description:
 * @date 2020-02-0416:17
 */
public class Leader extends ApprovalHandler{

    @Override
    public void process(int day) {
        if (day <= ApprovalHandler.LEADER_DAY) {
            System.out.println("Leader 已审批");
        }else{
            nextHandler.process(day);
        }
    }

}
