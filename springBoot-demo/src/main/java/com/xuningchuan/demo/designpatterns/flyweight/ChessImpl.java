package com.xuningchuan.demo.designpatterns.flyweight;

/**
 * @author xuningchuan
 * @Title: ChessImpl
 * @Description:
 * @date 2019/12/26下午8:50
 */
public class ChessImpl extends Chess {
    public ChessImpl(String type) {
        super(type);
    }

    @Override
    public void Location(Local local) {
        System.out.println(super.getType() + "    X:" + local.getX() + " Y:" + local.getY());
    }
}
