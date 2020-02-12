package com.xuningchuan.demo.designpatterns.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xuningchuan
 * @Title: Mediator 抽象中介者
 * @Description:
 * @date 2020-02-12 13:50
 */
public abstract class Mediator {

    Map<String, List<Member>> memberBindMap = new HashMap<>(); // 消费者与key 绑定关系map

    abstract void register(Member member, String key);

    abstract void register(Member member);

}
