package com.xuningchuan.demo.designpatterns.command;

/**
 * @author xuningchuan
 * @Title: NoodlesCommand
 * @Description:
 * @date 2020-02-0620:10
 */
public class NoodlesCommand implements Command {

    private Chef chef;

    public NoodlesCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cook();
    }
}
