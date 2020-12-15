package com.xuningchuan.demo.spring.aop;

import com.xuningchuan.demo.contants.AopAnno;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author xuningchuan
 * @Title: HelloAopServiceImpl
 * @Description:
 * @date 2019/12/15上午10:48
 */
@Service
@AopAnno
public class AspectAopServiceCGLBParent {
    //    @AopAnno
    public void helloAspectAop(String str) {
        if(StringUtils.isBlank(str)){
            throw new RuntimeException("aspect aop str is null !!!");
        }
        System.out.println("hello aspect aop:" + str);
    }

}
