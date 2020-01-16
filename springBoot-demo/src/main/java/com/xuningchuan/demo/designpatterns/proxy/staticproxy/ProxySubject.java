package com.xuningchuan.demo.designpatterns.proxy.staticproxy;

import com.xuningchuan.demo.designpatterns.proxy.Subject;

/**
 * @author xuningchuan
 * @Title: ProxySubject
 * @Description:
 * @date 2020-01-1513:42
 */
public class ProxySubject implements Subject {


    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
    }

    private void before(){
        System.out.println("staticProxy ----->  before");
    }

}
