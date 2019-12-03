package com.xuningchuan.demo.designpatterns.singleton;

/**
 * @author xuningchuan
 * @Title: SingletonLazy 懒汉式 不加锁
 * @Description:
 * @date 2019/12/3下午2:33
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (null == instance) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getInstance();
        SingletonLazy instance1 = SingletonLazy.getInstance();

        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance == instance1);

    }
}
