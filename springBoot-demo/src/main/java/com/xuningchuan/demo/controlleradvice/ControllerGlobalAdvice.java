package com.xuningchuan.demo.controlleradvice;

import com.xuningchuan.demo.exception.AppException;
import com.xuningchuan.demo.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * @author xuningchuan
 * @Title: RequestControllerAdvice
 * @Description:
 * @date 2019/11/7上午10:00
 */
@ControllerAdvice("com.xuningchuan.demo.controller")
@Slf4j
public class ControllerGlobalAdvice {


    /**
     * Description: 全局异常处理
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/11/7 上午11:31
     */
    @ExceptionHandler(AppException.class)
    @ResponseBody
    public <T> Response<T> handleException(AppException e){
        Response<T> response = new Response<>();
        response.setCode(e.getExceptionEnum().getCode());
        response.setMessage(e.getExceptionEnum().getMessage());
        return response;
    }

    /**
     * Description: 全局数据绑定
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/11/7 下午2:08
     */
     @ModelAttribute(name = "globalData")
     public Map<String, String> mydata(){
         Map<String, String> map = new HashMap<>();
         map.put("data", "全局数据测试");
         return map;
     }
}
