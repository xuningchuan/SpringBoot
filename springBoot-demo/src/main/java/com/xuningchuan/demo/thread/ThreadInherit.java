package com.xuningchuan.demo.thread;

import lombok.SneakyThrows;

/**
 * @author xuningchuan
 * @Title: ThreadInherit
 * @Description:
 * @date 2020-03-01 17:29
 */
public class ThreadInherit extends Thread {

    public ThreadInherit(String name) {
        super(name);
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
//            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " == " + i);
        }
    }
}
