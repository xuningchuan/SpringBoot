package com.xuningchuan.demo.designpatterns.decorator;

/**
 * @author xuningchuan
 * @Title: DecoratorDemo 装饰模式: 动态地给一个对象添加一些额外的功能  --结构型模式
 * @Description:
 * @date 2019/12/21下午2:30
 */
public class DecoratorDemo {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //原味咖啡
        Coffee coffee = new SimpleCoffee();
        print(coffee);

        // 加牛奶咖啡
        Coffee milkCoffee = new CoffeeDecoratorMilk(coffee);
        print(milkCoffee);

        // 加糖咖啡
        Coffee sugarCoffee = new CoffeeDecoratorSugar(coffee);
        print(sugarCoffee);

        // 加牛奶和糖 咖啡
        Coffee sugarMilkCoffee = new CoffeeDecoratorSugar(milkCoffee);
        print(sugarMilkCoffee);


    }

    static void print(Coffee coffee){
        System.out.println("配料: " + coffee.getIngredients());

        System.out.println("花费: " + coffee.getCost());

        System.out.println("=============");

    }
}
