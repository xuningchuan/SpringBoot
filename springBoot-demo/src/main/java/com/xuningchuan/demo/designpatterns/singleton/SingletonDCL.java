package com.xuningchuan.demo.designpatterns.singleton;

/**
 * @author xuningchuan
 * @Title: SingletonDCL 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @Description:
 * @date 2019/12/3下午2:33
 */
public class SingletonDCL {

    private volatile static SingletonDCL instance;

    private  SingletonDCL() {
    }

    public static SingletonDCL getInstance() {
        if(null == instance){
            synchronized (SingletonDCL.class){
                if(null == instance){
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        SingletonDCL instance = SingletonDCL.getInstance();
        SingletonDCL instance1 = SingletonDCL.getInstance();

        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance == instance1);

    }
}
