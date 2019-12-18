package com.xuningchuan.demo.designpatterns.filter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xuningchuan
 * @Title: Person
 * @Description:
 * @date 2019/12/18下午4:17
 */
@Data
@AllArgsConstructor
public class Person {

    /**
     *  姓名
     */
    private String name;

    /**
     *  性别
     */
    private String gender;
    /**
     *  婚姻状况
     */
    private String maritalStatus;

}
