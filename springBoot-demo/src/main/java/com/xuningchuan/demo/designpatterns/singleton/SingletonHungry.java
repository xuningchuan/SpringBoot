package com.xuningchuan.demo.designpatterns.singleton;

/**
 * @author xuningchuan
 * @Title: SingletonHungry 饿汉式 无锁 类加载时初始化对象
 * @Description:
 * @date 2019/12/3下午2:33
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonHungry instance = SingletonHungry.getInstance();
        SingletonHungry instance1 = SingletonHungry.getInstance();

        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance == instance1);

    }
}
