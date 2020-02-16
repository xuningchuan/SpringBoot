package com.xuningchuan.demo.designpatterns.visitor;

/**
 * @author xuningchuan
 * @Title: Visitor
 * @Description:
 * @date 2020-02-16 09:23
 */
public class DBAVisitor extends Visitor {
    public Long visit(Program program) {
        return program.getSqlTime();
    }
}
