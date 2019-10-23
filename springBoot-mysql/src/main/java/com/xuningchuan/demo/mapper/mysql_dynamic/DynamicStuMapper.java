package com.xuningchuan.demo.mapper.mysql_dynamic;

import com.xuningchuan.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xuningchuan
 * @Title: StudentMapper
 * @Description:
 * @date 2019/9/14下午6:49
 */
@Mapper
public interface DynamicStuMapper {

    List<Student> getStuFromMaster();

    List<Student> getStuFromSlave();
}
