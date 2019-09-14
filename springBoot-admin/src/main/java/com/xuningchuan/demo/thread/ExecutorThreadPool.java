package com.xuningchuan.demo.thread;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author xuningchuan
 * @Title: ExecutorThreadPool  java 线程池
 * @Description:
 * @date 2019/9/12下午6:11
 */
public class ExecutorThreadPool {


    public static void main(String[] args) throws InterruptedException {
        List <Future> productList = new ArrayList();
        ExecutorService threadPool = Executors.newFixedThreadPool(6);

        Future<String> submitP = threadPool.submit(new ThreadProduct());
        Thread.sleep(1000*3);
        productList.add(submitP);
        System.out.println("生产者数量-------------" + productList.size());
        for (int i = 0; i < productList.size(); i++) {
            Future<String> submitC = threadPool.submit(new ThreadCustomer());

        }
        Future<String> submitC = threadPool.submit(new ThreadCustomer());
        System.out.println("主线程--------------");
        threadPool.shutdown();

    }
}
