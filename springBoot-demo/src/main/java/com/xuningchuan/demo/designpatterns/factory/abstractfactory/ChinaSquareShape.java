package com.xuningchuan.demo.designpatterns.factory.abstractfactory;

/**
 * @author xuningchuan
 * @Title: ChinaCircleShap
 * @Description:
 * @date 2019/11/29下午2:16
 */
public class ChinaSquareShape extends AbstractSquareShape {
    @Override
    public void desc() {
        System.out.println("this is a china square");
    }
}
