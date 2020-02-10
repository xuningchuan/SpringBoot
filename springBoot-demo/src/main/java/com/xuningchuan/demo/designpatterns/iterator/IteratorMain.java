package com.xuningchuan.demo.designpatterns.iterator;

import java.util.List;

/**
 * @author xuningchuan
 * @Title: IteratorMain 迭代器模式 行为型模式 : 遍历对象的元素 不暴露其内部逻辑
 * @see List#iterator(),java.util.ArrayList#iterator()
 * @Description:
 * @date 2020-02-10 11:12
 */
public class IteratorMain {

    /**
     * Description: 迭代器模式  符合 高内聚,低耦合的设计原则
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2020-02-10 11:15
     */
    public static void main(String[] args) {
       NameCollection concreteCollection = new NameCollection();
       Iterator iterator = concreteCollection.getIterator();//隐藏了 NameIterator的实现
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
