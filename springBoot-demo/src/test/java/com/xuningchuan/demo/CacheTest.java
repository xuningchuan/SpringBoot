package com.xuningchuan.demo;

import com.xuningchuan.demo.service.CacheService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xuningchuan
 * @Title: CacheTest
 * @Description:
 * @date 2019/10/20上午11:35
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CacheTest {

    @Autowired
    private CacheService cacheService;

    @Test
    public void cacheTest(){
        System.out.println("参数1====="+cacheService.getCertFromCacheById("1"));
        System.out.println("参数2====="+cacheService.getCertFromCacheById("2"));
        System.out.println("参数1====="+cacheService.getCertFromCacheById("1"));
        System.out.println("清空参数1=====.begin");
        cacheService.EvictCertFromCacheById("1");
        System.out.println("清空参数1=====.end");
        System.out.println("清空后--参数1====="+cacheService.getCertFromCacheById("1"));
        System.out.println("清空后--参数1====="+cacheService.getCertFromCacheById("1"));
        System.out.println("清空后--参数2====="+cacheService.getCertFromCacheById("2"));

    }
}
