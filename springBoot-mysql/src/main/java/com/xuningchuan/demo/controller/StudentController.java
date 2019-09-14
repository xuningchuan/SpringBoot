package com.xuningchuan.demo.controller;

import com.xuningchuan.demo.entity.Student;
import com.xuningchuan.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xuningchuan
 * @Title: StudentController
 * @Description:
 * @date 2019/9/14下午6:43
 */
@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> getStuList() {
        return studentService.getStudentList();
    }

}
