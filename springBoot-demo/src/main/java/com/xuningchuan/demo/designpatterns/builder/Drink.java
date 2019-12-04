package com.xuningchuan.demo.designpatterns.builder;

/**
 * @author xuningchuan
 * @Title: Drink
 * @Description:
 * @date 2019/12/4下午5:06
 */
public abstract class Drink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float getPrice();
}
