package com.xuningchuan.demo.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xuningchuan
 * @Title: Sync
 * @Description:
 * @date 2020-08-07 10:45
 */
public class Sync {

     static volatile int  j = 3;
     static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        int  i = 1;
        int c = i + j;
        lock.lock();
        System.out.println(c);
        lock.unlock();
        new Sync().testSync();
    }

   public static synchronized void testSync() {
        synchronized (Sync.class){
            System.out.println("aa");

        }
    }
}
