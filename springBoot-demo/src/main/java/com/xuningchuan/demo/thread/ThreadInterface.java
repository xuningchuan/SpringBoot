package com.xuningchuan.demo.thread;

/**
 * @author xuningchuan
 * @Title: ThreadInterface
 * @Description:
 * @date 2020-03-01 17:38
 */
public class ThreadInterface implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " ==== " + i);
        }
    }
}
