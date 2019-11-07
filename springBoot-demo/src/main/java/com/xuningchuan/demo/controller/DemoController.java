package com.xuningchuan.demo.controller;

import com.xuningchuan.demo.contants.ExceptionEnum;
import com.xuningchuan.demo.controlleradvice.ControllerGlobalAdvice;
import com.xuningchuan.demo.controlleradvice.RequestControllerAdvice;
import com.xuningchuan.demo.controlleradvice.ResponseControllerAdvice;
import com.xuningchuan.demo.entity.Student;
import com.xuningchuan.demo.exception.AppException;
import com.xuningchuan.demo.filter.RequestFilter;
import com.xuningchuan.demo.vo.Response;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuningchuan
 * @Title: DemoController
 * @Description:
 * @date 2019/7/8下午8:53
 */
@RestController
public class DemoController  extends BaseController{


    /**
     * Description: 练习 全局异常处理
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/11/7 下午5:06
     * @see ControllerGlobalAdvice#handleException(com.xuningchuan.demo.exception.AppException)
     */
    @RequestMapping("/stu")
    public Response<Student> getStudent()  throws AppException{
        Student a = new Student();
        a.setId("1").setName("李明");
        throw new AppException(ExceptionEnum.FAIL);
    }

    /**
     * Description: 练习 @ControllerAdvice  全局绑定参数
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/11/7 下午5:01
     * @see com.xuningchuan.demo.controlleradvice.ControllerGlobalAdvice#mydata()
     */
    @GetMapping("/global")
    public String getGlobalData(Model model)  {
       return model.asMap().get("globalData").toString();
    }


    /**
     * Description: 练习 filter RequestBodyAdvice ResponseBodyAdvice 的使用
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/11/7 下午5:02
     * @see RequestFilter
     * @see RequestControllerAdvice
     * @see ResponseControllerAdvice
     */
    @PostMapping(value = "/addStu")
    public Student addStudent(@RequestBody Student student){
        return student;
    }
}
