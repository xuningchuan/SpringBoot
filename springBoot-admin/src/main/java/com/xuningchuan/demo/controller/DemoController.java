package com.xuningchuan.demo.controller;

import com.xuningchuan.demo.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuningchuan
 * @Title: DemoController
 * @Description:
 * @date 2019/7/8下午8:53
 */
@RestController
public class DemoController {

    @RequestMapping("/stu")
    public Student getStudent() {
        Student a = new Student();
        a.setId("1").setName("李明");
        System.out.println("test02提交测试");
        return a;
    }
}
