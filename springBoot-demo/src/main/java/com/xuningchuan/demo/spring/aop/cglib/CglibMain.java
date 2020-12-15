package com.xuningchuan.demo.spring.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author xuningchuan
 * @Title: CglibMain
 * @Description:
 * @date 2020-08-21 17:30
 */
public class CglibMain {

    /**
     *    cglib 动态代理实现
     * @param args
     */
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Leader.class);
        enhancer.setCallback(new CglibMethodInterceptor());
        Leader leader = (Leader) enhancer.create();
        leader.meeting();
    }
}
