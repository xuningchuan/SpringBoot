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
public class CGLIBAspect {
//
    @Pointcut("execution(* com.xuningchuan.demo.spring.aop.AspectAopServiceCGLB.helloAspectAop(..))")
    public void pointCut(){

    }

//    @Before("pointCut()")
    public void before(){
        System.out.println("before");
    }

//    @After("pointCut()")
    public void after(){
        System.out.println("after");
    }

//    @Around("pointCut()")
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("around before");
//        joinPoint.proceed();
//        System.out.println("around after");
//
//    }

//    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

//    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }


    /**
     *  测试 aspectj 指示器
     * @param joinPoint
     * @throws Throwable
     */
    //    @Around("pointCut()")   //切点
    @Around("pointCut() && @annotation(com.xuningchuan.demo.contants.AopAnno)") //标注@AopAnno 注解的方法
//    @Around("@within(com.xuningchuan.demo.contants.AopAnno)") //标注@AopAnno类下的所有方法


//    @Around("within(com.xuningchuan.demo.spring.aop.AspectAopServiceCGLB)") // 指定类下的所有方法
//    @Around("target(com.xuningchuan.demo.spring.aop.AopCglibInterface)") // 指定类或接口下的所有方法
//    @Around("this(com.xuningchuan.demo.spring.aop.AopCglibInterface)") // 指定类或接口下的所有方法

      //标注@AopAnno类下的所有 参数为str的方法 around 方法必须有str参数
//    @Around("@within(com.xuningchuan.demo.contants.AopAnno) && args(str)")
      //指定AspectAopServiceCGLB 下 入参类中标注AopAnno 的所有方法
//    @Around("within(com.xuningchuan.demo.spring.aop.AspectAopServiceCGLB) && @args(com.xuningchuan.demo.contants.AopAnno)")
     //指定 AopCglibInterface接口下的 所有被 @AopAnno 修饰的类的方法
//     @Around("target(com.xuningchuan.demo.spring.aop.AopCglibInterface) && @target(com.xuningchuan.demo.contants.AopAnno)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before");
        joinPoint.proceed();
        System.out.println("around after");

    }

}
