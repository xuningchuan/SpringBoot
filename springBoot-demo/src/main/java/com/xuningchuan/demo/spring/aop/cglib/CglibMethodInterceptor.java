package com.xuningchuan.demo.spring.aop.cglib;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xuningchuan
 * @Title: CglibMethodInterceptor
 * @Description:
 * @date 2020-08-21 17:31
 */
public class CglibMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        if("meeting".equals(method.getName())){
            System.out.println("begin paper ...");
            return methodProxy.invokeSuper(o, objects);
        }
        return methodProxy.invokeSuper(o, objects);
    }
}
