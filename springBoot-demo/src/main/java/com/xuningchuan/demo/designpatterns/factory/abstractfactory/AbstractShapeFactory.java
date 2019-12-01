package com.xuningchuan.demo.designpatterns.factory.abstractfactory;

import com.xuningchuan.demo.designpatterns.factory.Shape;

/**
 * @author xuningchuan
 * @Title: AbstractShapeFactory 抽象工厂模式
 * @Description:
 * @date 2019/11/29下午1:52
 */
public abstract class AbstractShapeFactory {

    public abstract Shape getCircleShape();

    public abstract Shape getSquareShape();


    public static void main(String[] args) {
        ChinaShapeFactory chinaShapeFactory = new ChinaShapeFactory();
        chinaShapeFactory.getCircleShape().desc();
        chinaShapeFactory.getSquareShape().desc();
    }
}
