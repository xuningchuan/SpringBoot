package com.xuningchuan.demo.designpatterns.iterator;

/**
 * @author xuningchuan
 * @Title: AbsIterator 抽象迭代器
 * @Description:
 * @date 2020-02-10 11:28
 */
public interface Iterator {
    Boolean hasNext();
    Object next();
}
