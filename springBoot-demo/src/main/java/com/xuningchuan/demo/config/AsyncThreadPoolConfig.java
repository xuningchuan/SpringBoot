package com.xuningchuan.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * @author xuningchuan
 * @Title: AsyncThreadPoolConfig 异步线程池配置
 * @Description:
 * @date 2019/11/27下午8:52
 */
@Configuration
@EnableAsync
@Slf4j
public class AsyncThreadPoolConfig implements AsyncConfigurer {

    /**
     * Description: 异步线程池  当线程达到最大线程数时 后续线程进入阻塞队列 当阻塞队列塞满 执行线程池拒绝策略
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/11/28 上午11:59
     */
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setThreadNamePrefix("Test-Async");//线程名称前缀
        executor.setCorePoolSize(3);//核心线程数
        executor.setMaxPoolSize(5);//最大线程数
        executor.setQueueCapacity(1);// 阻塞队列
        executor.setKeepAliveSeconds(1200);//
        executor.setDaemon(false);//是否是守护线程
        //拒绝策略--调用方运行策略
        RejectedExecutionHandler callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        //拒绝策略--丢弃任务 并抛出拒绝执行 RejectedExecutionException 异常信息。线程池默认的拒绝策略。需要捕获
        RejectedExecutionHandler abortPolicy = new ThreadPoolExecutor.AbortPolicy();
        //拒绝策略--直接丢弃
        RejectedExecutionHandler discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        //拒绝策略--丢弃阻塞队列  中最老的一个任务，并将新任务加入
        RejectedExecutionHandler discardOldestPolicy = new ThreadPoolExecutor.DiscardOldestPolicy();
        //自定义拒绝策略
        RejectedExecutionHandler customizeHandler = new RejectedExecutionHandler(){
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
              log.error("==自定义拒绝策略=={},{}", r.toString(), executor.toString());
            }
        };
        executor.setRejectedExecutionHandler(callerRunsPolicy);//线程池拒绝策略
        executor.initialize(); // 初始化 executor
        return executor;
    }

    /**
     * Description: 捕获 异步线程方法 产生的异常
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/11/28 下午1:55
     */
    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new AsyncUncaughtExceptionHandler(){

            @Override
            public void handleUncaughtException(Throwable ex, Method method, Object... params) {
                log.error("==异常处理=={}", ex.toString());
            }
        };
    }

    /**
     * Description: 模拟线程池 拒绝策略
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/11/28 上午11:41
     */
    public static void main(String[] args) {
        int corePoolSize = 2;
        int maximumPoolSize = 5;
        long keepAliveTime = 5;
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(1);

        //拒绝策略--调用方运行策略
        RejectedExecutionHandler handler1 = new ThreadPoolExecutor.CallerRunsPolicy();
        //拒绝策略--丢弃任务 并抛出拒绝执行 RejectedExecutionException 异常信息。线程池默认的拒绝策略。
        RejectedExecutionHandler handler2 = new ThreadPoolExecutor.AbortPolicy();
        //拒绝策略--直接丢弃
        RejectedExecutionHandler handler3 = new ThreadPoolExecutor.DiscardPolicy();
        //拒绝策略--丢弃阻塞
        RejectedExecutionHandler handler4 = new ThreadPoolExecutor.DiscardOldestPolicy();


        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.SECONDS, workQueue, handler4);
        for(int i=0; i<20; i++) {
            try {
                executor.execute(new Thread(() -> log.info(Thread.currentThread().getName() + " is running")));
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }
        executor.shutdown();
    }

}
