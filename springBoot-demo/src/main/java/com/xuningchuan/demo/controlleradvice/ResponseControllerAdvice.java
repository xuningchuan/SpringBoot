package com.xuningchuan.demo.controlleradvice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author xuningchuan
 * @Title: ResponseControllerAdvice
 * @Description:
 * @date 2019/11/7下午4:08
 */
@ControllerAdvice("com.xuningchuan.demo.controller")
@Slf4j
public class ResponseControllerAdvice implements ResponseBodyAdvice {

    /** 是否处理 本次请求*/
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    /** 数据处理 完成后操作 数据返回前的处理*/
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        log.info("返回数据处理--模拟加签[{}]", body);
        return body;
    }
}
