package com.xuningchuan.demo.controller;

import com.xuningchuan.demo.contants.ExceptionEnum;
import com.xuningchuan.demo.vo.Response;

/**
 * @author xuningchuan
 * @Title: BaseController
 * @Description:
 * @date 2019/11/7上午11:40
 */
public class BaseController {



    /**
     * Description: 统一封装返回结果
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/11/7 上午11:40
     */
    public <T> Response<T> result(T data, ExceptionEnum exceptionEnum){
        Response<T> response = new Response<>();
        response.setData(data);
        response.setCode(exceptionEnum.getCode());
        response.setMessage(exceptionEnum.getMessage());
        return response;
    }
}
