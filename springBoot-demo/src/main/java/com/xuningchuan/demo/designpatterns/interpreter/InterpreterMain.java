package com.xuningchuan.demo.designpatterns.interpreter;

/**
 * @author xuningchuan
 * @Title: InterpreterMain 解释器模式:识别文法,构建解释  行为型模式  用于对同一语法进行解释 常用于编译
 * @Description:
 * @date 2020-02-0817:44
 */
public class InterpreterMain {

    /**
     * Description: 解释器模式
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2020-02-08 18:23
     */
    public static void main(String[] args) {
        String context = "10 + 5 - 3";
        System.out.println("开始计算表达式: " + context);
        System.out.println("结果: " + context + " = " + Calculator.calculate(context));
    }
}
