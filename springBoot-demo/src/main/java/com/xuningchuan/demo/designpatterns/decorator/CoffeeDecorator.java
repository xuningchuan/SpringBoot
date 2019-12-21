package com.xuningchuan.demo.designpatterns.decorator;

/**
 * @author xuningchuan
 * @Title: CoffeeDecorator   咖啡 装饰器
 * @Description:
 * @date 2019/12/21下午2:39
 */
public abstract  class CoffeeDecorator implements Coffee {

    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public  double getCost(){
        return  coffee.getCost();
    };

    @Override
    public String getIngredients(){
        return coffee.getIngredients();
    };
}
