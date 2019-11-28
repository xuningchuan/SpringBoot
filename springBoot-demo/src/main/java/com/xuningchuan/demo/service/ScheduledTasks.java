package com.xuningchuan.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author xuningchuan
 * @Title: ScheduledTasks
 * @Description:
 * @date 2019/10/24上午11:32
 */

@Component
@Slf4j
public class ScheduledTasks {


      /**
       * Description: spingBoot 定时任务
       * @author xuningchuan[xu_nc@suixingpay.com>]
       * @param
       * @return
       * @date 2019/11/7 下午5:19
       */
//    @Scheduled(fixedRate = 5000)
//    public void schedule(){
//        log.info("==============now date[{}]", System.currentTimeMillis());
//    }
    /**
     * Description: 异步处理  另起一个线程处理
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/11/7 下午5:20
     */
    @Async
    public void async() throws InterruptedException {
        log.info("*********{}.begin", Thread.currentThread().getName());
        Thread.sleep(2000);
        log.info("*********{}.end", Thread.currentThread().getName());
        //throw new RuntimeException("test exception"); // 测试异步线程池捕获异常处理
    }

}
