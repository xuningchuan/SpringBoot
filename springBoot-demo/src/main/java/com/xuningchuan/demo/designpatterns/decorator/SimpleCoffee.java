package com.xuningchuan.demo.designpatterns.decorator;

/**
 * @author xuningchuan
 * @Title: SimpleCoffee
 * @Description:
 * @date 2019/12/21下午2:37
 */
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
