package com.xuningchuan.demo.current;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xuningchuan
 * @Title: SellTicket
 * @Description:
 * @date 2020-05-19 17:21
 */
public class SellTicket implements Runnable {

      Lock lock = new ReentrantLock();

      int num = 300;
    @Override
    public  void run() {
        try {

                while (num > 0){
//                    synchronized (this) {
                    lock.lock();
                    if(num > 0){
                        System.out.println(Thread.currentThread().getName() + "====出售第" + num + "张票");
                        num --;
                    }else {
                        lock.unlock();
                        break;

                    }
                    lock.unlock();
//                }
            }
        } finally {
//            lock.unlock();
        }
    }
}
