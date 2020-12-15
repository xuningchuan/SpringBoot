package com.xuningchuan.demo.thread;

/**
 * @author xuningchuan
 * @Title: Sync
 * @Description:
 * @date 2020-08-07 10:45
 */
public class Sync {

     static volatile int  j = 3;

    public static void main(String[] args) {
        int  i = 1;
//        int j = 2;
        int c = i + j;
        System.out.println(c);
        new Sync().testSync();
    }

    public synchronized   void  testSync (){
        synchronized (this){
            System.out.println("aa");

        }
    }
}
