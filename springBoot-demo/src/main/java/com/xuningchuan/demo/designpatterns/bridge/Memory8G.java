package com.xuningchuan.demo.designpatterns.bridge;

/**
 * @author xuningchuan
 * @Title: Memory8G
 * @Description:
 * @date 2019/12/17上午10:30
 */
public class Memory8G implements Memory {
    @Override
    public void addMemory() {
        System.out.println("this is 8G Memory");
    }
}
