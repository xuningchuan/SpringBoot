package com.xuningchuan.demo.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.BoundZSetOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void strRedisTest(){
        String strKey = "xu_nc";
        log.info("插入strKey[{}]", strKey);
        stringRedisTemplate.opsForValue().set(strKey, "帅");
        String sex = stringRedisTemplate.opsForValue().get(strKey);
        log.info("strKey--> value[{}]", sex);

    }

    @Test
    public void setStrRedis(){
        stringRedisTemplate.opsForValue().set("xu", "boy");
        log.info("redis 中sex为[{}]", stringRedisTemplate.opsForValue().get("xu"));
    }

    @Test
    public void redisTemplateTest(){

        // redisTemplate key value 序列化
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Object.class));
        redisTemplate.setHashValueSerializer(new StringRedisSerializer());

        String stringKey = "stringKey";
        log.info("插入key[{}]", stringKey);
        //string 保存5hour
        redisTemplate.opsForValue().set(stringKey, "南湘",5, TimeUnit.HOURS);
        String stringValue = (String)redisTemplate.opsForValue().get(stringKey);
        log.info("获取String[{}]", stringValue);


        //hash
        String hashKey = "hashKey";
        Map<String, String> map = new HashMap<>();
        map.put("name","张三");
        map.put("age","12");
        log.info("插入key[{}]", hashKey);
        BoundHashOperations boundHashOperations = redisTemplate.boundHashOps(hashKey);
        boundHashOperations.putAll(map);
        boundHashOperations.put("sex", "男");
        boundHashOperations.expire(10, TimeUnit.HOURS);
        Map entries = redisTemplate.opsForHash().entries(hashKey);
        log.info("获取hash[{}]", entries);

        //list
        String listKey = "listKey";
        BoundListOperations<String, Object> listOps = redisTemplate.boundListOps(listKey);
        listOps.expire(10, TimeUnit.HOURS);
        for (int i = 0; i < 3; i++) {
            listOps.rightPush("列表"+ i);
        }
        log.info("插入key[{}]", listKey);
        List<Object> range = listOps.range(0, listOps.size() - 1);
        log.info("获取list[{}],size[{}]", range, listOps.size());

        //set
        String setKey = "setKey";
        log.info("插入key[{}]", setKey);
        BoundSetOperations setOps = redisTemplate.boundSetOps(setKey);
        setOps.expire(10, TimeUnit.HOURS);
        setOps.add("集合1");
        setOps.add("集合2");
        Set members = setOps.members();
        log.info("获取set[{}]", members);


        //zset
        String zSetKey = "zSetKey";
        log.info("插入key[{}]", zSetKey);
        BoundZSetOperations zSetOps = redisTemplate.boundZSetOps(zSetKey);
        zSetOps.expire(10, TimeUnit.HOURS);
        zSetOps.add("集合1",10);
        zSetOps.add("集合1", 1);
        Set zSetRange = zSetOps.range(0, zSetOps.size() - 1);
        log.info("获取zSet[{}]", zSetRange);


    }


}
