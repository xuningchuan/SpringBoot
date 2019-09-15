package com.xuningchuan.demo.rabbit_mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


/**
 * @author xuningchuan
 * @Title: RabbitMqConfig  bean 配置类
 * @Description:
 * @date 2019/9/15上午10:24
 */
@Configuration
public class RabbitMqConfig {


    /** 默认 direct 模式配置 无需声明交换机 和绑定关系  队列名称 与 routingKey 一致即可*/
    @Bean
    public Queue defaultDirectQueue(){
        return new Queue("direct.default");
    }
    /** direct 模式配置*/
    //------direct 模式 配置-----------------begin--------------
    /*  队列  */
    @Bean
    public Queue directQueue(){
        return new Queue("direct.direct");
    }
    /*  交换机  */
    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("direct.exchange");
    }
    /*  绑定关系  */
    @Bean
    public Binding bindingDirectExchange(Queue directQueue, DirectExchange directExchange){
        return BindingBuilder.bind(directQueue).to(directExchange).with("direct.routingKey");
    }
    //------direct 模式 配置-----------------end--------------

    /** topic 模式配置*/
    //-------topic 模式 配置------------------begin--------------
    @Bean
    public Queue topicQueue(){
        return new Queue("topic.topic");
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("topic.exchange");
    }

    @Bean
    public Binding bindingTopicExchange(Queue topicQueue, TopicExchange topicExchange){
        return BindingBuilder.bind(topicQueue).to(topicExchange).with("topic.routingKey.#");
    }
    //-------topic 模式 配置------------------end--------------

    /** fanout 模式配置*/
    //-------fanout 模式 配置------------------begin----------
    @Bean
    public Queue fanoutQueueFirst(){
        return new Queue("fanout.fanout.first");
    }

    @Bean
    public Queue fanoutQueueSecond(){
        return new Queue("fanout.fanout.second");
    }

    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanout.exchange");
    }

    @Bean
    public Binding bindingFanoutFirstExchange(Queue fanoutQueueFirst, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(fanoutQueueFirst).to(fanoutExchange);
    }

    @Bean
    public Binding bindingFanoutSecondExchange(Queue fanoutQueueSecond, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(fanoutQueueSecond).to(fanoutExchange);
    }
    //-------fanout 模式 配置------------------end----------
    /** headers 模式*/
    //-------headers 模式 配置------------------begin----------
    @Bean
    public Queue headersQueue(){
        return new Queue("queue.headers");
    }

    @Bean
    public HeadersExchange headersExchange(){
        return new HeadersExchange("exchange.headers");
    }

    @Bean
    public Binding bindingHeadersExchange(Queue headersQueue, HeadersExchange headersExchange){
//        String headersKey = "headersKey";
        Map<String, Object> headersKeyMap = new HashMap<>();
        headersKeyMap.put("headersKey", "test");
        return BindingBuilder.bind(headersQueue).to(headersExchange).whereAll(headersKeyMap).match();
    }
    //-------headers 模式 配置------------------end------------

}
