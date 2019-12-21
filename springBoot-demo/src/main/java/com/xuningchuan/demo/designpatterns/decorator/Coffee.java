package com.xuningchuan.demo.designpatterns.decorator;

/**
 * @author xuningchuan
 * @Title: Coffee
 * @Description:
 * @date 2019/12/21下午2:30
 */
public interface Coffee {

    /**
     *  获取价格
     */
    double getCost();

    /**
     *
     * 获取配料
     */
    String getIngredients();
}
