package com.xuningchuan.demo.designpatterns.memento;

/**
 * @author xuningchuan
 * @Title: MementoMain 备忘录模式 行为型模式 不破坏类封装性情况下保存类状态信息
 * @Description:
 * @date 2020-02-15 18:28
 */
public class MementoMain {


    public static void main(String[] args) {
         Originator originator = new Originator();
         CareTaker careTaker = new CareTaker();
         String status ="加载配置";
         originator.setStatus(status);
         careTaker.addMemento(originator.saveToMemento(status));
         System.out.println("原始状态: " + originator.getStatus());
         originator.setStatus("加载驱动");
         System.out.println("中间状态: " + originator.getStatus());
         originator.setStatus(careTaker.getStatusFromMemento(0));
         System.out.println("回退到原始状态: " + originator.getStatus());
    }
}
