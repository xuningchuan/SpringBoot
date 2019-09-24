package com.example.demo.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.dubbo.api.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuningchuan
 * @Title: ConsumerDubboController
 * @Description:
 * @date 2019/9/17下午9:21
 */
@RestController
public class ConsumerDubboController {


    @Reference
    StudentService studentService;

    @RequestMapping(value = "/consumer")
    public String getConsumerStuName(){
        System.out.println("消费者接受到的消息:" + studentService.getStuName());
        return studentService.getStuName();
    }
}
