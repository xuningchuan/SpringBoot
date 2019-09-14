package com.xuningchuan.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author xuningchuan
 * @Title: Student
 * @Description:
 * @date 2019/9/14下午6:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student {

    /** 学生Id*/
    private String id;

    /** 学生姓名*/
    private String name;

}
