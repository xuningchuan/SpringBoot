package com.xuningchuan.demo.designpatterns.responsibilitychain;

/**
 * @author xuningchuan
 * @Title: ApprovalHandler
 * @Description:
 * @date 2020-02-0416:05
 */
public abstract class ApprovalHandler {

    public static int  MANAGER_DAY = 5;

    public static int  LEADER_DAY = 3;


    protected ApprovalHandler nextHandler;


    public void setNextHandler(ApprovalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void process(int day);
}
