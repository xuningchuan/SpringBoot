package com.example.demo.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.dubbo.api.StudentService;
import org.springframework.stereotype.Component;

/**
 * @author xuningchuan
 * @Title: StudentServiceImpl
 * @Description:
 * @date 2019/9/17下午9:12
 */
@Service
@Component
public class StudentServiceImpl implements StudentService {


    @Override
    public String getStuName() {
        String str = "hello dubbo";
        System.out.println("生产者发送的消息:" + str);
        return str;
    }
}
