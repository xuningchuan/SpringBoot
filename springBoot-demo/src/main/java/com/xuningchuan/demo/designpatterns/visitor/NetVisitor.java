package com.xuningchuan.demo.designpatterns.visitor;

/**
 * @author xuningchuan
 * @Title: NetVisitor
 * @Description:
 * @date 2020-02-16 09:23
 */
public class NetVisitor extends Visitor{

    @Override
    public Long visit(Program program) {
        return program.getNetTime();
    }
}
