package com.xuningchuan.demo.designpatterns.factory.simplefactory;

import com.xuningchuan.demo.contants.ExceptionEnum;
import com.xuningchuan.demo.designpatterns.factory.CircleShape;
import com.xuningchuan.demo.designpatterns.factory.Shape;
import com.xuningchuan.demo.designpatterns.factory.SquareShape;
import com.xuningchuan.demo.exception.AppException;

/**
 * @author xuningchuan
 * @Title: SimpleProductFactory 简单工厂模式--非23 设计模式之一 了解
 * @Description:
 * @date 2019/11/29上午11:21
 */
public class SimpleShapeFactory {

    public static Shape getShapeByType(String type) throws AppException {
        switch (type) {
            case "Circle":
                return new CircleShape();
            case "Square":
                return new SquareShape();
            default:
                throw new AppException(ExceptionEnum.UNKOWN_TYPE);
        }
    }

    public static void main(String[] args) {
        try {
            SimpleShapeFactory.getShapeByType("Circle").desc();
        } catch (AppException e) {
            e.printStackTrace();
        }
    }
}
