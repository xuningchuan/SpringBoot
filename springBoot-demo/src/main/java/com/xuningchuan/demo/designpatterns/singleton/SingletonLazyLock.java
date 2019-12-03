package com.xuningchuan.demo.designpatterns.singleton;

/**
 * @author xuningchuan
 * @Title: SingletonLazyLock 懒汉式 加锁 线程安全
 * @Description:
 * @date 2019/12/3下午2:33
 */
public class SingletonLazyLock {

    private static SingletonLazyLock instance;

    private SingletonLazyLock() {
    }

    public static synchronized SingletonLazyLock getInstance() {
        if (null == instance) {
            instance = new SingletonLazyLock();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonLazyLock instance = SingletonLazyLock.getInstance();
        SingletonLazyLock instance1 = SingletonLazyLock.getInstance();

        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance == instance1);

    }
}
