package com.xuningchuan.demo.designpatterns.bridge;

/**
 * @author xuningchuan
 * @Title: Memory4G
 * @Description:
 * @date 2019/12/17上午10:30
 */
public class Memory4G implements Memory {
    @Override
    public void addMemory() {
        System.out.println("this is 4G Memory");
    }
}
