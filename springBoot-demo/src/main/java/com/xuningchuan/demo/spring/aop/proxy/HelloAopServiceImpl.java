package com.xuningchuan.demo.spring.aop.proxy;

import com.xuningchuan.demo.spring.aop.proxy.HelloAopService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author xuningchuan
 * @Title: HelloAopServiceImpl
 * @Description:
 * @date 2019/12/15上午10:48
 */
@Service
public class HelloAopServiceImpl implements HelloAopService {


    @Override
    public void helloAop(String str) throws RuntimeException{
        if(StringUtils.isBlank(str)){
            throw new RuntimeException("str is null !!!");
        }
        System.out.println("hello aop:" + str);
    }


}
