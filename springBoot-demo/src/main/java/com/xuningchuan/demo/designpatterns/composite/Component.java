package com.xuningchuan.demo.designpatterns.composite;

/**
 * @author xuningchuan
 * @Title: Component  容器组件
 * @Description:
 * @date 2019/12/20上午10:41
 */
public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int dept);



}
