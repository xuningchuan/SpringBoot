package com.xuningchuan.demo.designpatterns.flyweight;

/**
 * @author xuningchuan
 * @Title: Chess
 * @Description:
 * @date 2019/12/26下午8:43
 */
public abstract class Chess {
    private String type;

    public Chess(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public abstract void Location(Local local);
}
