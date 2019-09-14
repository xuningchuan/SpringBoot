package com.xuningchuan.demo.service;

import com.xuningchuan.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuningchuan
 * @Title: StudentService
 * @Description:
 * @date 2019/9/14下午6:45
 */
public interface StudentService {
    List<Student> getStudentList();
}
