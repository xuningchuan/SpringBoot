package com.xuningchuan.demo.designpatterns.singleton;

/**
 * @author xuningchuan
 * @Title: SingletonStaticInner 静态内部类 1.延迟加载 2.线程安全
 * @Description:
 * @date 2019/12/3下午2:33
 */
public class SingletonStaticInner {


    /** 类构造器 只会加载一次 所以线程安全*/
    private static class SingletonHolder {
        private static final SingletonStaticInner instance = new SingletonStaticInner();
    }


    private SingletonStaticInner() {
    }

    public static final SingletonStaticInner getInstance() {
        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        SingletonStaticInner instance = SingletonStaticInner.getInstance();
        SingletonStaticInner instance1 = SingletonStaticInner.getInstance();

        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance == instance1);
    }
}
