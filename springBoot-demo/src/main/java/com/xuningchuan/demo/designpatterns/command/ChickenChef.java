package com.xuningchuan.demo.designpatterns.command;

/**
 * @author xuningchuan
 * @Title: ChickenChef
 * @Description:
 * @date 2020-02-0620:16
 */
public class ChickenChef extends Chef {
    @Override
    void cook() {
        System.out.println("cook Chicken!");
    }
}
