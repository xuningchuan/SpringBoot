package com.xuningchuan.demo.designpatterns.bridge;

/**
 * @author xuningchuan
 * @Title: Phone
 * @Description:
 * @date 2019/12/17上午10:31
 */
public abstract class Phone {

    public Memory memory;

    public void setMemory(Memory memory){
        this.memory = memory;
    }

    public Memory getMemory(){
        return this.memory;
    }


    public abstract void addPhone();
}
