package com.xuningchuan.demo.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xuningchuan
 * @Title: ThreadMain
 * @Description:
 * @date 2020-03-01 11:36
 */
public class ThreadMain {

    /**
     * Description: 多线程main
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2020-03-01 17:49
     */
    public static void main1(String[] args) throws Exception {
//        //1.继承 Thread
//        Thread threadInheritA = new ThreadInherit("extends A");
//        Thread threadInheritB = new ThreadInherit("extends B");
//        threadInheritA.start();
//        threadInheritB.start();

        // 2.实现 Runnable
//        Thread threadInterfaceA = new Thread(new ThreadInterface(), "interface A");
//        Thread threadInterfaceB = new Thread(new ThreadInterface(), "interface B");
//        threadInterfaceA.start();
//        threadInterfaceB.start();

        //3.通过线程池创建
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        for (int i = 0; i < 2; i++) {
//            executorService.submit(new ThreadInterface());
//        }
//        executorService.shutdown();

        //4.1 实现Callable 有返回值
//        Callable<String> callable = new ThreadCallable();
//        FutureTask<String> stringFutureTaskA = new FutureTask<>(callable);
//        FutureTask<String> stringFutureTaskB = new FutureTask<>(callable);
//
//        Thread threadCallableA = new Thread(stringFutureTaskA);
//        Thread threadCallableB = new Thread(stringFutureTaskB);
//        threadCallableA.start();
//        threadCallableB.start();
//        String resultA = stringFutureTaskA.get();
//        String resultB = stringFutureTaskA.get();
//        System.out.println("返回结果A: " + resultA);
//        System.out.println("返回结果B: " + resultB);

       // 4.2 线程池 + 实现Callable
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<String> callable = new ThreadCallable();
        List<Future> futureList= new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Future<String> submit = executorService.submit(callable);
            futureList.add(submit);
        }
        for (Future it : futureList) {
            System.out.println(it.get());
        }
        executorService.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
          lock.lock();
          lock.lock();
          System.out.println(lock.getHoldCount());
          lock.unlock();
         System.out.println(lock.getHoldCount());
          lock.unlock();

//        AtomicInteger integer = new AtomicInteger(0);
//        integer.getAndIncrement();
//        Atomic atomic = new ThreadMain().new Atomic();
//        for (int j = 0; j < 10; j++) {
////            Thread.sleep(1000);
//            new Thread(atomic).start();
//        }
    }

    class Atomic implements Runnable{
          AtomicInteger integer = new AtomicInteger(0);
          volatile int i = 0;


        @Override
        public void run() {
//            System.out.println(Thread.currentThread().getName() + "====" + integer.addAndGet(1));
            System.out.println(Thread.currentThread().getName() + "====" + ++i);

        }
    }
}
