package com.xuningchuan.demo.designpatterns.strategy;

/**
 * @author xuningchuan
 * @Title: SwordWeapon 武器 : 剑
 * @Description:
 * @date 2020-02-16 12:16
 */
public class SwordWeapon implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("use Sword fight ");
    }
}