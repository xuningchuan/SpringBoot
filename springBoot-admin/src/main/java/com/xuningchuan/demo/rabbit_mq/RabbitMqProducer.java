package com.xuningchuan.demo.rabbit_mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xuningchuan
 * @Title: RabbitMqProducer  rabbitMq 生产者
 * @Description:
 * @date 2019/9/15上午10:20
 */
@Component
@Slf4j
public class RabbitMqProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendDirectDefaultMsg(String msg){
        log.info("默认(direct)交换机模式--生产者开始发送消息[{}]", msg);
        /** 不指定exchange 默认 direct模式 routeKey 与队列名称一致时 消费者可以消费 */
        amqpTemplate.convertAndSend("direct.default", msg);
    }

    public void sendDirectMsg(String msg){
        log.info("direct交换机模式--生产者开始发送消息[{}]", msg);
        /** 指定exchange 为 direct模式 指定 routeKey  */
        amqpTemplate.convertAndSend("direct.exchange","direct.routingKey", msg);
    }

    public void sendTopicMsg(String msg){
        log.info("topic交换机模式--生产者开始发送消息[{}]", msg);
        /** 指定exchange 为 topic模式 指定 routeKey  topic.routingKey.#  模糊匹配多个  */
        amqpTemplate.convertAndSend("topic.exchange", "topic.routingKey.apple", msg);
    }

    public void sendFanoutMsg(String msg){
        log.info("fanout交换机模式--生产者开始发送消息[{}]", msg);
        amqpTemplate.convertAndSend("fanout.exchange", "", msg);
    }


    public void sendHeadersMsg(Message msg){
        log.info("headers交换机模式--生产者开始发送消息[{}]", new String(msg.getBody()));
        rabbitTemplate.convertAndSend("exchange.headers", "", msg);
    }
}
