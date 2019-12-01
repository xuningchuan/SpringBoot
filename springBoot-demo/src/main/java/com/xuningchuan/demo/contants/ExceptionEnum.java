package com.xuningchuan.demo.contants;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xuningchuan
 * @Title: ExceptionEnum
 * @Description:
 * @date 2019/11/7上午11:09
 */
public enum ExceptionEnum {

    SUCCESS("0000","成功"),
    FAIL("0001","失败"),
    UNKOWN_TYPE("0002","未知的类型");



    private static final Map<String, ExceptionEnum> lookup = new HashMap<>();

    static{

        EnumSet.allOf(ExceptionEnum.class).forEach(e -> lookup.put(e.code, e));
    }


    ExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ExceptionEnum getEnum(String code){
        return null == lookup.get(code) ? null : lookup.get(code);
    }
    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
