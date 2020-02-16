package com.xuningchuan.demo.designpatterns.memento;

import lombok.Data;

/**
 * @author xuningchuan
 * @Title: Memento 备忘录类
 * @Description:
 * @date 2020-02-15 18:29
 */
@Data
public class Memento {

    private String status;

    public Memento(String status) {
        this.status = status;
    }

}
