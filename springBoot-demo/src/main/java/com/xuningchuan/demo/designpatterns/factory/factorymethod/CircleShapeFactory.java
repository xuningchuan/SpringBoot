package com.xuningchuan.demo.designpatterns.factory.factorymethod;

import com.xuningchuan.demo.designpatterns.factory.CircleShape;
import com.xuningchuan.demo.designpatterns.factory.Shape;

/**
 * @author xuningchuan
 * @Title: CircleShapeFactory
 * @Description:
 * @date 2019/11/29上午11:55
 */
public class CircleShapeFactory extends ShapeFactory {
    @Override
    Shape getShapeByType() {
        return new CircleShape();
    }
}
