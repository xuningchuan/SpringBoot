package com.xuningchuan.demo.spring.aop;

import com.xuningchuan.demo.contants.AopAnno;
import com.xuningchuan.demo.spring.aop.proxy.HelloAopService;
import lombok.Value;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author xuningchuan
 * @Title: HelloAopServiceImpl
 * @Description:
 * @date 2019/12/15上午10:48
 */
@Service
public class AspectAopServiceImpl implements AspectAopService {


    @Override
    public void helloAspectAop(String str) {
        if(StringUtils.isBlank(str)){
            throw new RuntimeException("aspect aop str is null !!!");
        }
        System.out.println("hello aspect aop:" + str);
    }

    @Override
    @AopAnno(value = "i am aopAnno")
    public void helloAopAnno(String str) {
        System.out.println("hello aop anno" + str);
    }
}
