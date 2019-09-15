package com.xuningchuan.demo.rabbit_mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuningchuan
 * @Title: RabbitMqTest   RabbitMq 单元测试
 * @Description:
 * @date 2019/9/15上午10:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RabbitMqTest {

    @Autowired
    private RabbitMqProducer rabbitMqProducer;

    /**
     * Description:  rabbitMq 默认 direct 模式 单元测试
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/9/15 上午10:40
     */
    @Test
    public void rabbitMqDirectDefaultTest(){
        rabbitMqProducer.sendDirectDefaultMsg("hello direct default rabbitMq!");
    }

    /**
     * Description: rabbitMq 指定 direct 模式 单元测试
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/9/15 上午11:48
     */
    @Test
    public void rabbitMqDirectTest(){
        rabbitMqProducer.sendDirectMsg("hello direct rabbitMq!");
    }

    /**
     * Description: rabbitMq 指定 topic 模式 单元测试
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/9/15 下午3:00
     */
    @Test
    public void rabbitMqTopicTest(){
        rabbitMqProducer.sendTopicMsg("hello topic rabbitMq");
    }

    /**
     * Description: rabbitMq 指定 fanout 模式 单元测试
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/9/15 下午3:00
     */
    @Test
    public void rabbitMqFanoutTest(){
        rabbitMqProducer.sendFanoutMsg("hello fanout rabbitMq");
    }

    /**
     * Description: rabbitMq 指定 header 模式 单元测试
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/9/15 下午3:00
     */
    @Test
    public void rabbitMqHeaderTest(){
        MessageProperties messageProperties = new MessageProperties();
        Map<String, Object> headersKeyMap = new HashMap<>();
        headersKeyMap.put("headersKey", "test");
        messageProperties.setDeliveryMode(MessageDeliveryMode.NON_PERSISTENT);
        messageProperties.getHeaders().putAll(headersKeyMap);
        Message message = new Message("hello headers rabbitMq!".getBytes(), messageProperties);
        rabbitMqProducer.sendHeadersMsg(message);
    }

}
