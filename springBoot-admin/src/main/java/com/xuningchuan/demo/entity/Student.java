package com.xuningchuan.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author xuningchuan
 * @Title: Student
 * @Description:
 * @date 2019/7/8下午9:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student {
    String id;
    String name;

    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("1");
    }
}
