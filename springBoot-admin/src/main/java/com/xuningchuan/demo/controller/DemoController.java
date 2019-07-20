package com.xuningchuan.demo;

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

    @RequestMapping("/")
    public String getStudent(){

    }
}
