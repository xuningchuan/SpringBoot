package com.xuningchuan.demo.designpatterns.template;

/**
 * @author xuningchuan
 * @Title: BaseBo 公共业务处理
 * @Description:
 * @date 2020-02-15 19:39
 */
public abstract class BaseBo {

    public abstract void check(ContextBo contextBo); //校验参数

    public abstract void doSave(ContextBo contextBo); //落库

    public abstract void preCallHandle(ContextBo contextBo);// 请求上游预处理

    public abstract void call(ContextBo contextBo); //请求上游

    public abstract void afterCallHandle(ContextBo contextBo); //请求上游后处理

    public abstract void doUpdate(ContextBo contextBo); //更新库

    public abstract void response (ContextBo contextBo); //返给下游

    /**
     *
     * @param contextBo 处理请求模板 顺序由抽象类决定 子类实现
     */
    public final void handle(ContextBo contextBo){
        check(contextBo);
        doSave(contextBo);
        preCallHandle(contextBo);
        call(contextBo);
        afterCallHandle(contextBo);
        doUpdate(contextBo);
        response(contextBo);
    }
}
