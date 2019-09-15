package com.xuningchuan.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author xuningchuan
 * @Title: Redis
 * @Description:
 * @date 2019/9/15下午7:01
 */
public class Redis {

    @Autowired
    private RedisTemplate redisTemplate;

    public void addRedis(){

    }

}
