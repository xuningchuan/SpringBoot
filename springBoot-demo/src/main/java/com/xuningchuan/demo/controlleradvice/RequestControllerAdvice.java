package com.xuningchuan.demo.controlleradvice;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;

/**
 * @author xuningchuan
 * @Title: RequestControllerAdvice
 * @Description:
 * @date 2019/11/7下午2:33
 */
@ControllerAdvice("com.xuningchuan.demo.controller")
@Slf4j
public class RequestControllerAdvice implements RequestBodyAdvice {

    /** 是否处理 本次请求*/
    @Override
    public boolean supports(MethodParameter methodParameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    /** 处理 空的请求*/
    @Override
    public Object handleEmptyBody(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        return body;
    }

    /** 数据处理 前进行的操作  一般用于 数据处理前的预处理*/
    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) throws IOException {
        return new RequestHttpInputMessage(inputMessage);
    }

    /** 数据处理 后处理的操作 */
    @Override
    public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        return body;
    }

    public class RequestHttpInputMessage implements HttpInputMessage{

        private HttpHeaders headers;
        private InputStream body;
        public RequestHttpInputMessage(HttpInputMessage inputMessage) throws IOException {
            String data = IOUtils.toString(inputMessage.getBody(), "UTF-8");
            log.info("请求数据处理---模拟验签[{}]", data);
            this.body = IOUtils.toInputStream(data, "UTF-8");
        }

        @Override
        public InputStream getBody() throws IOException {
            return body;
        }

        @Override
        public HttpHeaders getHeaders() {
            return headers;
        }
    }
}
