package com.xuningchuan.demo.designpatterns.interpreter;

/**
 * @author xuningchuan
 * @Title: NumExpression
 * @Description:
 * @date 2020-02-0817:47
 */
public class NumExpression implements Expression {
    private int num;

    public NumExpression(int num){
        this.num = num;
    }

    @Override
    public int interpreter() {
        return this.num;
    }
}
