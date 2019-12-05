package com.xuningchuan.demo.designpatterns.observer;

/**
 * @author xuningchuan
 * @Title: Observer  观察者抽象类
 * @Description:
 * @date 2019/12/5下午2:26
 */
public abstract class Observer {

    Subject subject;

    abstract void update(float temperature, float pressure, float humidity);

    abstract void display(float temperature, float pressure, float humidity);

}
