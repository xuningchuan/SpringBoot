package com.xuningchuan.demo.designpatterns.decorator;

/**
 * @author xuningchuan
 * @Title: CoffeeDecoratorMilk
 * @Description:
 * @date 2019/12/21下午2:41
 */
public class CoffeeDecoratorMilk extends CoffeeDecorator {
    public CoffeeDecoratorMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " Milk";
    }
}
