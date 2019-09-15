package com.xuningchuan.demo.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xuningchuan
 * @Title: RedisTest
 * @Description:
 * @date 2019/9/15下午7:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void getStrRedis(){
        String sex = stringRedisTemplate.opsForValue().get("sex");
        log.info("redis 中sex为[{}]", sex);
    }

    @Test
    public void setStrRedis(){
        stringRedisTemplate.opsForValue().set("xu", "boy");
        log.info("redis 中sex为[{}]", stringRedisTemplate.opsForValue().get("xu"));
    }

    @Test
    public void redisTemplateTest(){
        redisTemplate.opsForValue().set("xu_nc", "boys");
        System.out.println(redisTemplate.opsForValue().get("xu_nc"));
    }


}
