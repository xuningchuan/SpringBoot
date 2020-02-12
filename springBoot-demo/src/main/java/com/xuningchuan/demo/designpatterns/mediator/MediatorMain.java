package com.xuningchuan.demo.designpatterns.mediator;

/**
 * @author xuningchuan
 * @Title: MediatorMain  中介者模式 行为型模式  利用一个中介者对象 完成多个对象的交互 由网状结构转化为星型结构
 *                       生产者和消费者解耦 交互(通信)由中介对象处理
 * @Description:
 * @date 2020-02-12 13:47
 */
public class MediatorMain {

    /**
     * Description:  中介者模式  模拟 rabbitMq fanout 模式
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2020-02-12 14:29
     */
    public static void main(String[] args) {
        Mediator mediator = new MessageMediator();// 中介

        Member producerMember = new ProducerMember();

        Member consumerMember = new ConsumerMember();

        Member consumerMember1 = new ConsumerMember();


        mediator.register(producerMember); //注册生产者

        mediator.register(consumerMember, "Trade"); //注册消费者 开启监听key 消息

        mediator.register(consumerMember1, "Trade1"); //注册消费者 开启监听key 消息

        producerMember.send("trade success!", "Trade");

        producerMember.send("trade fail!", "Trade1");

    }
}
