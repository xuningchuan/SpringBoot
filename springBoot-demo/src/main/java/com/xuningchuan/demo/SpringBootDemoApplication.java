package com.xuningchuan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author xuningchuan
 * @Title: SpringBootDemoApplication
 * @Description:
 * @date 2019/7/8下午8:44
 */
@SpringBootApplication
@EnableCaching
@EnableScheduling
@EnableAsync
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}