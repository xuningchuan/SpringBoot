package com.xuningchuan.demo;

import com.xuningchuan.demo.service.ScheduledTasks;
import com.xuningchuan.demo.spring.aop.AspectAopService;
import com.xuningchuan.demo.spring.aop.AspectAopServiceCGLB;
import com.xuningchuan.demo.spring.aop.AspectAopServiceCGLBParent;
import com.xuningchuan.demo.spring.aop.AspectAopServiceImpl;
import com.xuningchuan.demo.spring.ioc.lifecycle.ChinesePerson;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xuningchuan
 * @Title: SpringDemoTest
 * @Description:
 * @date 2019/10/24上午11:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class SpringDemoTest {

    @Autowired
    private ScheduledTasks scheduledTasks;

    @Autowired
    private ChinesePerson chinesePerson;

    @Autowired
    private AspectAopService aopService;

    @Autowired
    private AspectAopServiceCGLB aspectAopServiceCGLB;


    /**
     * Description: 测试异步线程
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/12/8 下午6:27
     */
    @Test
    public void asyncTest() throws InterruptedException {
        log.info("========={}.begin", Thread.currentThread().getName());
        for(int i=0; i<20;i++){
            scheduledTasks.async();
        }
        log.info("========={}.end", Thread.currentThread().getName());
        Thread.sleep(5000);
    }

    @Test
    public void beanLifeCycle(){
        chinesePerson.animalService();
    }


    /**
     * Description: 测试 AOP--JDK代理模式   目标类 有接口 使用 JDK 动态代理
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/12/15 下午7:04
     */
    @Test
    public void testJDKAop(){
        System.out.println("==========没有@AopAnno修饰的  后置不增强");
        aopService.helloAspectAop("Aspect AOP JDK");
        System.out.println("==========@AopAnno修饰的 后置增强");
        aopService.helloAopAnno("Aspect AOP JDK  after");
    }

    /**
     * Description: 测试 AOP--CGLIB代理模式 目标类 无接口 使用 CGLIB 动态代理
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/12/15 下午7:04
     */
    @Autowired
    private AspectAopServiceCGLBParent aspectAopServiceCGLBParent;

    @Test
    public void testCGLIBAop(){
//        aspectAopServiceCGLBParent.helloAspectAop("sss");
        aspectAopServiceCGLB.helloAspectAop("Aspect AOP CGLIB");
        aspectAopServiceCGLB.helloAspectAop11(new AspectAopServiceCGLB());

    }

}
