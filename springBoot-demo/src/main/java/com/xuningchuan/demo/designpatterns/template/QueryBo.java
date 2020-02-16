package com.xuningchuan.demo.designpatterns.template;

/**
 * @author xuningchuan
 * @Title: QueryBo
 * @Description:
 * @date 2020-02-15 19:53
 */
public class QueryBo  extends BaseBo{

    @Override
    public void check(ContextBo contextBo) {
        System.out.println("check");
    }

    @Override
    public void doSave(ContextBo contextBo) {
        System.out.println("doSave");

    }

    @Override
    public void preCallHandle(ContextBo contextBo) {
        System.out.println("preCallHandle");

    }

    @Override
    public void call(ContextBo contextBo) {
        System.out.println("call");

    }

    @Override
    public void afterCallHandle(ContextBo contextBo) {
        System.out.println("afterCallHandle");

    }

    @Override
    public void doUpdate(ContextBo contextBo) {
        System.out.println("doUpdate");

    }

    @Override
    public void response(ContextBo contextBo) {
        System.out.println("response");

    }
}
