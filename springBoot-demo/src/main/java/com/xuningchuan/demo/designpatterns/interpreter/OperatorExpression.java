package com.xuningchuan.demo.designpatterns.interpreter;

/**
 * @author xuningchuan
 * @Title: OperatorExpression
 * @Description:
 * @date 2020-02-0817:49
 */
public abstract class OperatorExpression implements Expression {

    public Expression leftNum;
    public Expression rightNum;

    public OperatorExpression(Expression leftNum, Expression rightNum) {
        this.leftNum = leftNum;
        this.rightNum = rightNum;
    }
}
