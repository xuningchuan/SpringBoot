package com.xuningchuan.demo.designpatterns.facade;

/**
 * @author xuningchuan
 * @Title: ShapeCircle
 * @Description:
 * @date 2019/12/23下午7:37
 */
public class ShapeCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
