package com.xuningchuan.demo;

import com.xuningchuan.demo.service.ScheduledTasks;
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
}
