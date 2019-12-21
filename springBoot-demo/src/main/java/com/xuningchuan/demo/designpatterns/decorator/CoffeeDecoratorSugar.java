package com.xuningchuan.demo.designpatterns.decorator;

/**
 * @author xuningchuan
 * @Title: CoffeeDecoratorSugar
 * @Description:
 * @date 2019/12/21下午2:41
 */
public class CoffeeDecoratorSugar extends CoffeeDecorator {
    public CoffeeDecoratorSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " Sugar";
    }
}
