package com.xuningchuan.demo.designpatterns.facade;

/**
 * @author xuningchuan
 * @Title: ShapeSquare
 * @Description:
 * @date 2019/12/23下午7:38
 */
public class ShapeSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
