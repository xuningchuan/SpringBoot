package com.xuningchuan.demo.designpatterns.command;

/**
 * @author xuningchuan
 * @Title: NoodlesChef
 * @Description:
 * @date 2020-02-0620:12
 */
public class NoodlesChef extends Chef {

    @Override
    void cook() {
        System.out.println("cook Noodles!");
    }
}
