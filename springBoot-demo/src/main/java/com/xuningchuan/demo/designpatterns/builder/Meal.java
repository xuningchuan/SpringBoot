package com.xuningchuan.demo.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xuningchuan
 * @Title: Meal
 * @Description:
 * @date 2019/12/4下午5:13
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = items.stream().map(Item::getPrice).reduce(0.0f, Float::sum);
        return cost;
    }

    public void showItem(){
        items.forEach(item -> {
            System.out.print("商品名称:"+ item.getName());
            System.out.print("  包装方式:"+ item.packing().getPack());
            System.out.println("  价格￥:"+ item.getPrice());

        });
    }

}
