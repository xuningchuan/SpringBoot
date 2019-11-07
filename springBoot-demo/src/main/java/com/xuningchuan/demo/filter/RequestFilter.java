package com.xuningchuan.demo.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xuningchuan
 * @Title: RequestFilter
 * @Description:
 * @date 2019/11/7下午4:16
 */
@Component
@Slf4j
public class RequestFilter extends OncePerRequestFilter {

    /** 对请求一次过滤 一般 用于设置全局变量 设置字符编码 等*/
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("filter.begin");
        Long start = System.currentTimeMillis();
        filterChain.doFilter(request, response);
        log.info("filter.begin,耗时[{}]", System.currentTimeMillis() - start);
    }
}
