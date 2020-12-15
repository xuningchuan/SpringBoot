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
    String name = testPt();
    String id =testStatic();


    static {
        System.out.println("static 代码块");
    }

    {
        System.out.println("代码块");
    }
    static String testStatic(){
        System.out.println("static 初始化变量");

        return "qq";
    }
     String testPt(){
         System.out.println("初始化变量");
        return "qq";
    }
    public static void main(String[] args) {
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("test 01 第四次提交");
        System.out.println("-----");
        Student student = new Student();
    }
}
