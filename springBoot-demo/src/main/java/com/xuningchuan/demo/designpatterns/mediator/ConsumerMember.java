package com.xuningchuan.demo.designpatterns.mediator;

/**
 * @author xuningchuan
 * @Title: ConsumerMember   消费者
 * @Description:
 * @date 2020-02-12 14:07
 */
public class ConsumerMember extends Member {


    @Override
    void send(String message, String key) {
    }

    @Override
    void receive(String message, String key) {
        System.out.println(this.getClass().getSimpleName() + " receiveMsg : " + message + "  key: " + key);
    }
}
