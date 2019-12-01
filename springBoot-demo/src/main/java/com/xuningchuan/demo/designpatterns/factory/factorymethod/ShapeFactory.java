package com.xuningchuan.demo.designpatterns.factory.factorymethod;

import com.xuningchuan.demo.designpatterns.factory.Shape;

/**
 * @author xuningchuan
 * @Title: ShapeFactory  工厂方法模式
 * @Description:
 * @date 2019/11/29上午11:56
 */
public abstract class ShapeFactory {
     abstract Shape getShapeByType();

    public static void main(String[] args) {
        CircleShapeFactory circleShapeFactory = new CircleShapeFactory();
        circleShapeFactory.getShapeByType().desc();
        SquareShapeFactory squareShapeFactory = new SquareShapeFactory();
        squareShapeFactory.getShapeByType().desc();
    }
}
