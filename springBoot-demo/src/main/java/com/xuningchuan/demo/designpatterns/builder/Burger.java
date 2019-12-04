package com.xuningchuan.demo.designpatterns.builder;

/**
 * @author xuningchuan
 * @Title: Burger
 * @Description:
 * @date 2019/12/4下午5:06
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float getPrice();
}
