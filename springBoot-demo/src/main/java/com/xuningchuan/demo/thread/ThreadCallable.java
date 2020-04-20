package com.xuningchuan.demo.thread;

import java.util.concurrent.Callable;

/**
 * @author xuningchuan
 * @Title: ThreadCallable
 * @Description:
 * @date 2020-03-01 17:59
 */
public class ThreadCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 50; i++) {
//            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " ==== " + i);
        }
        return "over";
    }
}
