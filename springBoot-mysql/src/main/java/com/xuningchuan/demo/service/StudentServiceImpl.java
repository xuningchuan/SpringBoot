package com.xuningchuan.demo.service;

import com.xuningchuan.demo.entity.Student;
import com.xuningchuan.demo.mapper.mysql_db.StudentMapper;
import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan(basePackages = "com.xuningchuan.demo.mapper")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper stuMapper;

    @Override
    public List<Student> getStudentList() {
        return stuMapper.getStudentList();
    }
}
