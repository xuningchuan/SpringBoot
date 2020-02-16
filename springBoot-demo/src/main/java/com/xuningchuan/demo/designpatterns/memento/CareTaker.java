package com.xuningchuan.demo.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuningchuan
 * @Title: CareTaker 备忘录管理
 * @Description:
 * @date 2020-02-15 18:33
 */
public class CareTaker {

    private List<Memento> list;

    public CareTaker(){
        list = new ArrayList<>();
    }
    public void addMemento(Memento memento){
        this.list.add(memento);
    }

    public String getStatusFromMemento(int i){
        return list.get(i).getStatus();
    }
}
