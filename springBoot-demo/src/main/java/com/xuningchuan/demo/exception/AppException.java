package com.xuningchuan.demo.exception;

import com.xuningchuan.demo.contants.ExceptionEnum;
import lombok.Data;

/**
 * @author xuningchuan
 * @Title: AppException
 * @Description:
 * @date 2019/11/7上午10:36
 */
@Data
public class AppException extends Exception{

    /** 错误码*/
    private String code;

    /** 错误信息*/
    private String message;

    /** 错误信息 枚举*/
    private ExceptionEnum exceptionEnum;

    public AppException(String code, String message, ExceptionEnum exceptionEnum) {
        super(code + "" + message);
        this.code = code;
        this.message = message;
        this.exceptionEnum = exceptionEnum;
    }

    public AppException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getCode() + "" + exceptionEnum.getMessage());
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMessage();
        this.exceptionEnum = exceptionEnum;
    }

}
