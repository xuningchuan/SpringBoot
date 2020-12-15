package com.xuningchuan.demo.spring.aop.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xuningchuan
 * @Title: MyProxyBean
 * @Description:
 * @date 2019/12/15上午11:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProxyBean implements InvocationHandler {

    private Object target;

    private Interceptor interceptor;

    /**
     * Description: 处理代理方法的逻辑
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/12/15 下午2:29
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        boolean exceptionFlg = false;

        this.interceptor.before();
        Object retObj = null;
        try {
            if (this.interceptor.useAround()) {
                retObj = this.interceptor.around(method, target, args);
            } else {
                retObj = method.invoke(target, args);
            }
        } catch (Exception e) {
            System.out.println("异常:" + e.getMessage());
            exceptionFlg = true;
        }
        this.interceptor.after();
        if (exceptionFlg) {
            this.interceptor.afterThrowing();
        } else {
            this.interceptor.afterReturning();
        }
        return retObj;
    }


}
