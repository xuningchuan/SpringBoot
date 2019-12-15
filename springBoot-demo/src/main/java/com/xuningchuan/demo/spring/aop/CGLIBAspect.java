package com.xuningchuan.demo.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author xuningchuan
 * @Title: MyAspect
 * @Description:
 * @date 2019/12/15下午5:59
 */
@Component
@Aspect
public class CGLIBAspect {

    @Pointcut("execution(* com.xuningchuan.demo.spring.aop.AspectAopServiceCGLB.helloAspectAop(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(){
        System.out.println("before");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("after");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before");
        joinPoint.proceed();
        System.out.println("around after");

    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

}
