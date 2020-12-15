package com.xuningchuan.demo.spring.aop;

import com.xuningchuan.demo.contants.AopAnno;
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
public class JDKAspect {

    @Pointcut("execution(* com.xuningchuan.demo.spring.aop.AspectAopService.*(..))")
    public void pointCut(){

    }

    @Before("pointCut() && args(str)")
    public void before(String str){
        System.out.println("before 输入参数:" + str);
    }

    @After("pointCut() && @annotation(com.xuningchuan.demo.contants.AopAnno)")
    public void after(){
        System.out.println("after");
    }

    @Around("pointCut() && @annotation(aopAnno)")
    public void around(ProceedingJoinPoint joinPoint, AopAnno aopAnno) throws Throwable {
        System.out.println("around before 注解参数==== " + aopAnno.value());
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
