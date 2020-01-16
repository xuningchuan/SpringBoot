package com.xuningchuan.demo.designpatterns.proxy.staticproxy;

import com.xuningchuan.demo.designpatterns.proxy.RealSubject;

/**
 * @author xuningchuan
 * @Title: StaticProxyDemo
 * @Description:
 * @date 2020-01-1513:41
 */
public class StaticProxyDemo {


    /**
    * Description: 代理模式 -- 静态代理模式 代理类和目标类 实现同一接口 代理类包含目标类 增强目标类
    * @author xuningchuan[xu_nc@suixingpay.com>]
    * @param
    * @return
    * @date 2020-01-15 13:48
    */
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.request();
    }
}
