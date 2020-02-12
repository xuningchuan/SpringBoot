package com.xuningchuan.demo.designpatterns.mediator;

/**
 * @author xuningchuan
 * @Title: 生产者
 * @Description:
 * @date 2020-02-12 14:07
 */
public class ProducerMember extends Member {

    @Override
    void send(String message, String key) {
        System.out.println(this.getClass().getSimpleName() + " sendMsg : " + message + "  key: " + key);
        if(null == mediator.memberBindMap.get(key)){
            System.out.println("no message about key: " + key);
        }else {
            mediator.memberBindMap.get(key).forEach(member -> member.receive(message, key));
        }
    }

    @Override
    void receive(String message, String key) {
    }
}
