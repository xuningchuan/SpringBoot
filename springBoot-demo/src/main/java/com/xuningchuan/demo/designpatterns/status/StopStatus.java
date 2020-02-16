package com.xuningchuan.demo.designpatterns.status;

/**
 * @author xuningchuan
 * @Title: StopStatus
 * @Description:
 * @date 2020-02-16 11:24
 */
public class StopStatus implements Status {
    @Override
    public void doAction(Context context) {
        System.out.println("stop, do some things");
        context.setStatus(this);
    }
}
