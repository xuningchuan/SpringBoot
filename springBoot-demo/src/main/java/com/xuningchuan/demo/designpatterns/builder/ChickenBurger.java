package com.xuningchuan.demo.designpatterns.builder;

import lombok.Data;

/**
 * @author xuningchuan
 * @Title: ChickenBurger
 * @Description:
 * @date 2019/12/4下午5:09
 */
@Data
public class ChickenBurger extends Burger{
    @Override
    public String getName() {
        return "鸡肉汉堡";
    }

    @Override
    public float getPrice() {
        return 20.0f;
    }
}
