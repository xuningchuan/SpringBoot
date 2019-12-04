package com.xuningchuan.demo.designpatterns.builder;

/**
 * @author xuningchuan
 * @Title: Wrapper
 * @Description:
 * @date 2019/12/4下午5:05
 */
public class Wrapper implements Packing {

    @Override
    public String getPack() {
        return "纸盒";
    }
}
