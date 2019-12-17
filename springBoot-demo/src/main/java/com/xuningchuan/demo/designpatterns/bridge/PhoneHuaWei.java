package com.xuningchuan.demo.designpatterns.bridge;

/**
 * @author xuningchuan
 * @Title: PhoneXiaoMi
 * @Description:
 * @date 2019/12/17上午10:34
 */
public class PhoneHuaWei extends Phone {


    public PhoneHuaWei(Memory memory){
        super.setMemory(memory);
    }
    @Override
    public void addPhone() {
        super.getMemory().addMemory();
        System.out.println("this is a HuaWei phone");
    }
}
