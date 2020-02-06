package com.xuningchuan.demo.designpatterns.command;

/**
 * @author xuningchuan
 * @Title: ChickenCommand
 * @Description:
 * @date 2020-02-0620:10
 */
public class ChickenCommand implements Command {

    private Chef chef;

    public ChickenCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cook();
    }
}
