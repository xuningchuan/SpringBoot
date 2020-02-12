package com.xuningchuan.demo.designpatterns.mediator;

/**
 * @author xuningchuan
 * @Title: Member 成员对象抽象类
 * @Description:
 * @date 2020-02-12 13:55
 */
public abstract class Member {

    public Mediator mediator; // 中介对象

    abstract void send(String message, String key);

    abstract void receive(String message, String key);

}
