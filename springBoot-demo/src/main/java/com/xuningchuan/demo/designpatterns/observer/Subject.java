package com.xuningchuan.demo.designpatterns.observer;

/**
 * @author xuningchuan
 * @Title: Subject  主题
 * @Description:
 * @date 2019/12/5下午2:47
 */
public interface Subject {

    /** 通知观察者 */
    void notifyObserver();

    /** 增加观察者 */
    void registerObserver(Observer observer);

    /** 移除观察者 */
    void removeObserver(Observer observer);
}
