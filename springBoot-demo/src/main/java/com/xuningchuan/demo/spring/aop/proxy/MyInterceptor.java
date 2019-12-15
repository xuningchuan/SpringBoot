package com.xuningchuan.demo.spring.aop.proxy;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author xuningchuan
 * @Title: InterceptorImpl
 * @Description:
 * @date 2019/12/15上午11:04
 */
public class MyInterceptor implements Interceptor {

    // 模拟 前置通知
    @Override
    public void before() {
        System.out.println("before");
    }


    // 模拟 环绕通知
    @Override
    public Object around(Method method, Object target, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("around before");
        Object object =  method.invoke(target, args);
        System.out.println("around after");
        return object;
    }

    // 模拟 后置通知
    @Override
    public void after() {
        System.out.println("after");
    }


    // 模拟 后置正常返回通知
    @Override
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    // 模拟 后置异常返回通知
    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    @Override
    public boolean useAround() {
        return true;
    }


}
