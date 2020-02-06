package com.xuningchuan.demo.designpatterns.command;

/**
 * @author xuningchuan
 * @Title: CommandDemo 命令模式 行为型模式 请求者 与执行者解耦 封装了调用细节
 * @Description:
 * @date 2020-02-0619:15
 */
public class CommandDemo {

    /**
     * Description: 命令模式 将各种请求封装成各个对象(类似计算机的指令)  每个对象调用相应执行者执行
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2020-02-06 20:19
     */
    public static void main(String[] args) {
        Command  chickenCommand = new ChickenCommand(new ChickenChef());
        Command  noodlesCommand = new NoodlesCommand(new NoodlesChef());
        System.out.println("======== chicken please =========");
        chickenCommand.execute();
        System.out.println("======== noodles please =========");
        noodlesCommand.execute();
    }
}
