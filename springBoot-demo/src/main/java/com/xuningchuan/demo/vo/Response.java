package com.xuningchuan.demo.vo;

import lombok.Data;

/**
 * @author xuningchuan
 * @Title: Response
 * @Description:
 * @date 2019/11/7上午11:36
 */
@Data
public class Response<T> {

    private String code;

    private String message;

    private T data;

}
