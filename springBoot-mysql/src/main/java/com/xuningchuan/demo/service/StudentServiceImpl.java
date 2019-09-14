package com.xuningchuan.demo.service;

import com.xuningchuan.demo.entity.Student;
import com.xuningchuan.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuningchuan
 * @Title: StudentServiceImpl
 * @Description:
 * @date 2019/9/14下午6:49
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudentList() {
        return studentMapper.getStudentList();
    }
}
