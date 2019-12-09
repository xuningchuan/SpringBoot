package com.xuningchuan.demo.spring.ioc.lifecycle;

import org.springframework.stereotype.Component;

/**
 * @author xuningchuan
 * @Title: Cat
 * @Description:
 * @date 2019/12/8下午6:42
 */
@Component
public class Cat implements Animal {

    @Override
    public void used() {
        System.out.println("this is a cat");
    }

}
