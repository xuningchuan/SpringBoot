package com.xuningchuan.demo.designpatterns.proxy;

/**
 * @author xuningchuan
 * @Title: RealSubject
 * @Description:
 * @date 2020-01-1513:40
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject request");
    }
}
