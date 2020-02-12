package com.xuningchuan.demo.designpatterns.mediator;


import java.util.ArrayList;

/**
 * @author xuningchuan
 * @Title: MessageMediator 消息中介
 * @Description:
 * @date 2020-02-12 13:59
 */
public class MessageMediator extends Mediator {


    @Override
    void register(Member member, String key) {
        member.mediator = this;
        super.memberBindMap.computeIfAbsent(key, k -> new ArrayList<>()); // 指定key 不存在 赋予新的对象
        super.memberBindMap.get(key).add(member);
    }

    @Override
    void register(Member member) {
        member.mediator = this;
    }


}
