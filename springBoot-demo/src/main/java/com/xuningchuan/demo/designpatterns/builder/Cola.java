package com.xuningchuan.demo.designpatterns.builder;

import lombok.Data;

/**
 * @author xuningchuan
 * @Title: cola
 * @Description:
 * @date 2019/12/4下午5:12
 */
@Data
public class Cola extends Drink {
    @Override
    public String getName() {
        return "可乐";
    }

    @Override
    public float getPrice() {
        return 30.0f;
    }
}
