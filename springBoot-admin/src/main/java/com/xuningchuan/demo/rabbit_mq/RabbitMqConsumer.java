package com.xuningchuan.demo.rabbit_mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author xuningchuan
 * @Title: RabbitMqConsumer rabbitMq 消费者
 * @Description:
 * @date 2019/9/15上午10:20
 */
@Component
@Slf4j
public class RabbitMqConsumer {

    @RabbitListener(queues = "direct.default")
    @RabbitHandler
    public void receiveDirectDefaultMsg(String msg){
        log.info("默认交换机(direct)模式--消费者接收到的消息[{}]", msg);
    }

    @RabbitListener(queues = "direct.direct")
    @RabbitHandler
    public void receiveDirectMsg(String msg){
        log.info("direct交换机模式--消费者接收到的消息[{}]", msg);
    }

    @RabbitListener(queues = "topic.topic")
    @RabbitHandler
    public void receviceTopicMsg(String msg){
        log.info("topic交换机模式--消费者接受到的消息[{}]", msg);
    }

    @RabbitListener(queues = "fanout.fanout.first")
    @RabbitHandler
    public void receviceFanoutMsgFirst(String msg){
        log.info("fanout交换机模式--消费者First接受到的消息[{}]", msg);
    }

    @RabbitListener(queues = "fanout.fanout.second")
    @RabbitHandler
    public void receviceFanoutMsgSecond(String msg){
        log.info("fanout交换机模式--消费者Second接受到的消息[{}]", msg);
    }

    @RabbitListener(queues = "queue.headers")
    @RabbitHandler
    public void receviceHeadersMsg(Message msg){
        log.info("header交换机模式--消费者接受到的消息[{}]", new String(msg.getBody()));
    }
}

