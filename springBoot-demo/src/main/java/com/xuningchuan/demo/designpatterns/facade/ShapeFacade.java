package com.xuningchuan.demo.designpatterns.facade;

/**
 * @author xuningchuan
 * @Title: ShapeFacade
 * @Description:
 * @date 2019/12/23下午7:39
 */
public class ShapeFacade {

    private Shape circle;

    private Shape square;

    public ShapeFacade(){
        this.circle = new ShapeCircle();
        this.square = new ShapeSquare();
    }

    public void drawCircle(){
        this.circle.draw();
    }

    public void drawSquare(){
        this.square.draw();
    }


}
