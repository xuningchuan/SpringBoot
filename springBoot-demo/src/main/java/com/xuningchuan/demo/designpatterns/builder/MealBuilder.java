package com.xuningchuan.demo.designpatterns.builder;

/**
 * @author xuningchuan
 * @Title: MealBuilder 建造者模式 :复杂的对象的构建与它的表示分离   组装流程相同 具体实现不同
 * @Description:
 * @date 2019/12/4下午5:34
 */
public class MealBuilder {

    public Meal order1(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Cola());
        return meal;
    }

    public Meal order2(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Cola());
        return meal;
    }

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal order1 = mealBuilder.order1();
        Meal order2 = mealBuilder.order2();
        System.out.println("*****套餐一*****");
        order1.showItem();
        System.out.println("总金额:" + order1.getCost());

        System.out.println("*****套餐二*****");
        order2.showItem();
        System.out.println("总金额:" + order2.getCost());

    }
}
