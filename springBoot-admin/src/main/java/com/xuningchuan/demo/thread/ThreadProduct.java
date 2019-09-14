package com.xuningchuan.demo.thread;

import java.util.concurrent.Callable;

/**
 * @author xuningchuan
 * @Title: ThreadProduct
 * @Description:
 * @date 2019/9/12下午6:14
 */
public class ThreadProduct implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ "生产者-----" + i);
        }
        return "P";
    }
}
