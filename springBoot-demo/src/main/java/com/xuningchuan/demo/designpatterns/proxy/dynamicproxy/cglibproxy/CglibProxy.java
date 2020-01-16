package com.xuningchuan.demo.designpatterns.proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xuningchuan
 * @Title: CglibProxy
 * @Description:
 * @date 2020-01-1515:31
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public Object createCglibProxyInstance(Object object){
        this.target = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("dynamicProxy -----> cglibProxy before");
        return method.invoke(target, objects);
    }
}
