package com.xuningchuan.demo.designpatterns.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xuningchuan
 * @Title: JdkProxyHandler
 * @Description:
 * @date 2020-01-1514:46
 */
public class JdkProxy implements InvocationHandler {

    private Object target;

    public  Object createJdkProxyInstance(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dynamicProxy -----> jdkProxy before");
        return method.invoke(target, args);
    }
}
