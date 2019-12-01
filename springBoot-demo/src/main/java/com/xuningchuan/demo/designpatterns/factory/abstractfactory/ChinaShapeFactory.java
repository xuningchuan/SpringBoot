package com.xuningchuan.demo.designpatterns.factory.abstractfactory;

import com.xuningchuan.demo.designpatterns.factory.Shape;

/**
 * @author xuningchuan
 * @Title: RedShapeFactory
 * @Description:
 * @date 2019/11/29下午1:59
 */
public class ChinaShapeFactory extends AbstractShapeFactory {

    @Override
    public Shape getCircleShape() {
        return new ChinaCircleShape();
    }

    @Override
    public Shape getSquareShape() {
        return new ChinaSquareShape();
    }
}
