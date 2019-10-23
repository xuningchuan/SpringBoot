package com.xuningchuan.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author xuningchuan
 * @Title: CacheService  spring cache demo
 * @Description:
 * @date 2019/10/20上午11:29
 */
@Service
@Slf4j
@CacheConfig(cacheNames = "cert")
public class CacheService{


  @Cacheable(key = "#id")
  public Long getCertFromCacheById (String id){
      Long time = System.currentTimeMillis();
      log.info("参数[{}],返回[{}]", id, time);
      return time;
  }
    @CacheEvict
    public void EvictCertFromCacheById (String id){
        log.info("清空 参数[{}]的cache", id);
    }

}
