package com.xuningchuan.demo.designpatterns.status;

/**
 * @author xuningchuan
 * @Title: StartStatus
 * @Description:
 * @date 2020-02-16 11:24
 */
public class StartStatus implements Status {
    @Override
    public void doAction(Context context) {
        System.out.println("start, do some things");
        context.setStatus(this);
    }
}
