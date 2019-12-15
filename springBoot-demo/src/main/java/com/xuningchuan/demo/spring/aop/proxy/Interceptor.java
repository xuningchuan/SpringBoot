package com.xuningchuan.demo.spring.aop.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author xuningchuan  拦截器接口 模拟AOP 通知 Advice
 * @Title: Interceptor
 * @Description:
 * @date 2019/12/15上午10:52
 */
public interface Interceptor {

    void before();

    void after();

    Object around(Method method, Object target, Object[] args) throws InvocationTargetException, IllegalAccessException;

    void afterReturning();
    
    void afterThrowing();
    
    boolean useAround();

}
