package com.xuningchuan.demo.designpatterns.interpreter;

/**
 * @author xuningchuan
 * @Title: OperatorSubtractExpression
 * @Description:
 * @date 2020-02-0818:17
 */
public class OperatorSubtractExpression extends OperatorExpression {

    public OperatorSubtractExpression(Expression leftNum, Expression rightNum) {
        super(leftNum, rightNum);
    }

    @Override
    public int interpreter() {
        return (super.leftNum.interpreter() - super.rightNum.interpreter());
    }
}
