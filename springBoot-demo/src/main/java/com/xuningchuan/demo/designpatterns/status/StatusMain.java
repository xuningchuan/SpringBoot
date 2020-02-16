package com.xuningchuan.demo.designpatterns.status;

/**
 * @author xuningchuan
 * @Title: status  状态模式 行为型模式 类的行为随着状态变化  将状态抽离出来  改变状态驱动行为变化
 * @Description:
 * @date 2020-02-16 11:22
 */
public class StatusMain {

    public static void main(String[] args) {
        Context context = new Context();
        Status startStatus = new StartStatus();
        Status stopStatus = new StopStatus();

        startStatus.doAction(context);
        stopStatus.doAction(context);

    }
}
