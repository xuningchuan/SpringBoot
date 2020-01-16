package com.xuningchuan.demo.designpatterns.proxy.dynamicproxy.cglibproxy;

import com.xuningchuan.demo.designpatterns.proxy.RealSubject;
import com.xuningchuan.demo.designpatterns.proxy.Subject;

/**
 * @author xuningchuan
 * @Title: CglibProxyDemo
 * @Description:
 * @date 2020-01-1617:11
 */
public class CglibProxyDemo {

    /**
     * Description: 代理模式 --Cglib 动态代理 目标类无需实现接口
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2020-01-16 17:13
     */
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = (Subject)new CglibProxy().createCglibProxyInstance(realSubject);
        subject.request();
    }
}
