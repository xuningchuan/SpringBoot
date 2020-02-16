package com.xuningchuan.demo.designpatterns.strategy;

/**
 * @author xuningchuan
 * @Title: KnifeWeapon  武器: 短刀
 * @Description:
 * @date 2020-02-16 12:16
 */
public class KnifeWeapon implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("use knife fight ");
    }
}