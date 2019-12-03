package com.xuningchuan.demo.designpatterns.singleton;

/**
 * @author xuningchuan
 * @Title: SingletonEnum 枚举类 隐藏了私有构造器 可读性差
 * @Description:
 * @date 2019/12/3下午2:33
 */
public enum  SingletonEnum {

    INSTANCE;


    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        SingletonEnum instance1 = SingletonEnum.INSTANCE;

        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance == instance1);

    }
}
