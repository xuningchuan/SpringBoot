package com.xuningchuan.demo.designpatterns.template;

import com.xuningchuan.demo.designpatterns.visitor.Visitor;

/**
 * @author xuningchuan
 * @Title: TemplateMain 模板模式 行为型模式  抽象类定义执行的模板(顺序) 它的子类可以按需重写方法实现
 *                             封装不变的 拓展可变的
 * @Description:
 * @date 2020-02-15 19:37
 */
public class TemplateMain {


    /**
     *
     * @param args  模板模式: 封装不变的 拓展可变的
     */
    public static void main(String[] args) {
        BaseBo queryBo = new QueryBo();
        ContextBo contextBo = new ContextBo();
        queryBo.handle(contextBo);
    }
}
