package com.xuningchuan.demo.designpatterns.factory;

import lombok.NoArgsConstructor;

/**
 * @author xuningchuan
 * @Title: CircleShape
 * @Description:
 * @date 2019/11/29上午11:25
 */
@NoArgsConstructor
public class CircleShape extends Shape {

    @Override
    public void desc() {
        System.out.println("this is Circle;");
    }
}
