package com.xuningchuan.demo.spring.aop.proxy;


/**
 * @author xuningchuan
 * @Title: AopMainDemo
 * @Description:
 * @date 2019/12/15下午2:57
 */
public class AopProxyDemo {


        /**
         * Description: 模拟 AOP 动态代理  spring 动态代理：目标类有接口 使用JDK 没有则使用 cglib
         * @author xuningchuan[xu_nc@suixingpay.com>]
         * @param
         * @return
         * @date 2019/12/15 下午4:55
         */
        public static void main(String[] args) {
            //JDK 动态代理
            Interceptor interceptor = new MyInterceptor();
            HelloAopService target = new HelloAopServiceImpl();
            HelloAopService proxyInstance = (HelloAopService)ProxyBeanFactory.getProxyBean(target, interceptor);
            System.out.println("========模拟正常返回=======");
            proxyInstance.helloAop("AOP");
            System.out.println("========模拟异常返回=======");
            proxyInstance.helloAop(null);
        }
}
