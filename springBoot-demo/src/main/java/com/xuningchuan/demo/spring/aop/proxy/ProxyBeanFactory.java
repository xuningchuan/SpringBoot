package com.xuningchuan.demo.spring.aop.proxy;

import java.lang.reflect.Proxy;

/**
 * @author xuningchuan
 * @Title: ProxyBeanFactory
 * @Description:
 * @date 2019/12/15下午4:48
 */
public class ProxyBeanFactory {

    /**
     * Description: 获取 代理bean
     *
     * @param
     * @return
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @date 2019/12/15 下午4:48
     */
    public static Object getProxyBean(Object target, Interceptor interceptor) {

        // 1.直接用lamda 表达式生成对象
//        Object proxyInstance = Proxy.newProxyInstance(target.getClass().getClassLoader(),
//            target.getClass().getInterfaces(),
//            (proxy, method, args1) -> {   // lamda 表达式代替 匿名内部类
//                boolean exceptionFlg = false;
//                interceptor.before();
//                Object object = null;
//                try {
//                    if (interceptor.useAround()) {
//                        object = interceptor.around(method, target, args1);
//                    } else {
//                        object = method.invoke(target, args1);
//                    }
//                } catch (Exception e) {
//                    System.out.println("异常:" + e.getMessage());
//                    exceptionFlg = true;
//                }
//                interceptor.after();
//                if (exceptionFlg) {
//                    interceptor.afterThrowing();
//                } else {
//                    interceptor.afterReturning();
//                }
//                return object;
//            });
//        return proxyInstance;


         // 2.具体实现抽离出来
        Object proxyInstance = Proxy.newProxyInstance(target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            new ProxyBean(target, interceptor));
        return proxyInstance;

    }

}
