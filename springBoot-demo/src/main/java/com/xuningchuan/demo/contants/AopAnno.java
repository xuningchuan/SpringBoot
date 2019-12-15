package com.xuningchuan.demo.contants;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xuningchuan
 * @Title: AopAnno
 * @Description:
 * @date 2019/12/15下午7:17
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface AopAnno {

    String value() default "AOP";
}
