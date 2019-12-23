package com.xuningchuan.demo.designpatterns.facade;

/**
 * @author xuningchuan
 * @Title: FacadeDemo  外观模式: 提供一个统一的接口，用来访问子系统中的一群接口 对外隐藏内部复杂的实现 --结构型模式
 * @Description:
 * @date 2019/12/23下午7:36
 */
public class FacadeDemo {

    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawSquare();
    }
}
