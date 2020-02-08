package com.xuningchuan.demo.designpatterns.interpreter;

/**
 * @author xuningchuan
 * @Title: OperatorAddExpression
 * @Description:
 * @date 2020-02-0818:17
 */
public class OperatorAddExpression extends OperatorExpression {

    public OperatorAddExpression(Expression leftNum, Expression rightNum) {
        super(leftNum, rightNum);
    }

    @Override
    public int interpreter() {
        return (super.leftNum.interpreter() + super.rightNum.interpreter());
    }
}
