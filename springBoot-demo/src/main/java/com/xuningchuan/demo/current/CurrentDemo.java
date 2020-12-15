package com.xuningchuan.demo.current;

import apple.security.AppleProvider;
import lombok.SneakyThrows;

/**
 * @author xuningchuan
 * @Title: CurrentDemo
 * @Description:
 * @date 2020-05-19 17:03
 */
public class CurrentDemo {

    @SneakyThrows
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        Thread a = new Thread(sellTicket);
        Thread b =new Thread(sellTicket);
        Thread c =new Thread(sellTicket);
        a.start();
        b.start();
        c.start();
//        ClassLoader classLoader = SellTicket.class.getClassLoader();
//        System.out.println(classLoader);
//
//        ClassLoader classLoader1 = LoadTest.class.getClassLoader();
//        System.out.println(classLoader1);
////        System.out.println(classLoader == classLoader1);
////
//        Class<?> aClass = classLoader.loadClass("java.lang.String");
//        LoadTest a = (LoadTest)aClass.newInstance();
//        Class.forName("com.xuningchuan.demo.current.LoadTest");
//        Class.forName("com.xuningchuan.demo.current.LoadTest", false, classLoader);

//        for (int i = 0; i < 3; i++) {
//            new Thread(new SellTicket()).start();
//        }
    }
}
