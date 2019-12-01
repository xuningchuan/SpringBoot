package com.xuningchuan.demo.designpatterns.factory.factorymethod;

import com.xuningchuan.demo.designpatterns.factory.Shape;
import com.xuningchuan.demo.designpatterns.factory.SquareShape;

/**
 * @author xuningchuan
 * @Title: CircleShapeFactory
 * @Description:
 * @date 2019/11/29上午11:55
 */
public class SquareShapeFactory extends ShapeFactory {
    @Override
    Shape getShapeByType() {
        return new SquareShape();
    }
}
