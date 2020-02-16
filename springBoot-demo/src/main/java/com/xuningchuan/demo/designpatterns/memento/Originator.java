package com.xuningchuan.demo.designpatterns.memento;

import lombok.Data;

/**
 * @author xuningchuan
 * @Title: Originator  原来的类
 * @Description:
 * @date 2020-02-15 18:30
 */
@Data
public class Originator {
    private String status;

    public Memento saveToMemento(String status){
        return new Memento(status);
    }
}
