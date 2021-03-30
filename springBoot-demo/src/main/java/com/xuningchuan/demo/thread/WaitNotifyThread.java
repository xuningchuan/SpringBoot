package com.xuningchuan.demo.thread;

import lombok.SneakyThrows;

/**
 * @author xuningchuan
 * @Title: WaitNotifyThread
 * @Description:
 * @date 2021-01-20 11:27
 */
public class WaitNotifyThread {

//  class ThreadB

    private static final Object object = new Object();

//    @SneakyThrows
    @SneakyThrows
    public static void main(String[] args) {
        new Thread(()->{
            synchronized (object){
                System.out.println("A is Running");
                object.notify();
                System.out.println("A is complete");
            }
        }).start();


        Thread.sleep(1000);
        new Thread(()->{
            synchronized (object){
                System.out.println("B wait for A");
                try {
                    object.wait();
                    object.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("B is complete");
            }
        }).start();


        Thread.sleep(1000);
        new Thread(()->{
            synchronized (object){
                System.out.println("C wait for B");
                try {
                    object.wait();
                    object.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("C is complete");
            }
        }).start();
        Thread.sleep(3000);
        synchronized (object){
            System.out.println("wait for ABC complete");
            object.notifyAll();
            object.wait();
            System.out.println("main complete");
        }

        System.out.println("all complete");

    }


}
