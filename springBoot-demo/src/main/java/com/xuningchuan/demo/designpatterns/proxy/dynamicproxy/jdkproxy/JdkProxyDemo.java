package com.xuningchuan.demo.designpatterns.proxy.dynamicproxy.jdkproxy;

import com.xuningchuan.demo.designpatterns.proxy.RealSubject;
import com.xuningchuan.demo.designpatterns.proxy.Subject;


/**
 * @author xuningchuan
 * @Title: JdkProxyDemo
 * @Description:
 * @date 2020-01-1514:45
 */
public class JdkProxyDemo {

    /**
     * Description: 代理模式 --JDK动态代理 目标类需要实现接口
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2020-01-15 14:57
     */
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = (Subject)new JdkProxy().createJdkProxyInstance(realSubject);
        subject.request();
    }
}
