package com.xuningchuan.demo.designpatterns.interpreter;

import java.util.Stack;

/**
 * @author xuningchuan
 * @Title: Calculator
 * @Description:
 * @date 2020-02-0818:26
 */
public class Calculator {

    private  static Stack<Expression> stack = new Stack<>();

    public static int calculate(String context){
        String[] elements = context.split(" ");
        Expression num;
        Expression leftNum;
        Expression rightNum;
        for (int i = 0; i < elements.length; i++) {
            switch (elements[i]){
                case "+":
                    leftNum = stack.pop();
                    rightNum = new NumExpression(Integer.valueOf(elements[++i]));
                    stack.push(new OperatorAddExpression(leftNum, rightNum));
                    System.out.println("栈顶元素  " + stack.peek().interpreter());
                    break;
                case "-":
                    leftNum = stack.pop();
                    rightNum = new NumExpression(Integer.valueOf(elements[++i]));
                    stack.push(new OperatorSubtractExpression(leftNum, rightNum));
                    System.out.println("栈顶元素  " + stack.peek().interpreter());
                    break;
                default:
                    num = new NumExpression(Integer.valueOf(elements[i]));
                    stack.push(num);
                    System.out.println("栈顶元素  " + num.interpreter());
                    break;
            }
        }
        return stack.pop().interpreter();

    }
}
