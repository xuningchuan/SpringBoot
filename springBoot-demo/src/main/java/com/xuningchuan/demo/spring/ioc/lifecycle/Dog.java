package com.xuningchuan.demo.spring.ioc.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author xuningchuan
 * @Title: Dog
 * @Description:
 * @date 2019/12/8下午6:42
 */
@Component
@Slf4j
//@Primary
public class Dog implements Animal {

    @Override
    public void used() {
        log.info("[{}],this is a dog", this.getClass().getSimpleName());
        System.out.println("this is a dog");
    }
}
