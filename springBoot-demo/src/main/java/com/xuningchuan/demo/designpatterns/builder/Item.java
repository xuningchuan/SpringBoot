package com.xuningchuan.demo.designpatterns.builder;

/**
 * @author xuningchuan
 * @Title: Item
 * @Description:
 * @date 2019/12/4下午5:02
 */
public interface Item {
    /** 物品名称*/
    String getName();

    /** 包装方式*/
    Packing packing();

    /** 价格*/
    float getPrice();
}
