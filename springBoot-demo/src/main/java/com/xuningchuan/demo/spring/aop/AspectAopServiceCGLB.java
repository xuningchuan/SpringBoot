package com.xuningchuan.demo.spring.aop;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author xuningchuan
 * @Title: HelloAopServiceImpl
 * @Description:
 * @date 2019/12/15上午10:48
 */
@Service
public class AspectAopServiceCGLB {



    public void helloAspectAop(String str) {
        if(StringUtils.isBlank(str)){
            throw new RuntimeException("aspect aop str is null !!!");
        }
        System.out.println("hello aspect aop:" + str);
    }
}
