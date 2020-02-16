package com.xuningchuan.demo.designpatterns.strategy;

/**
 * @author xuningchuan
 * @Title: StrategyMain 策略模式 行为型模式 类的行为随着执行策略的改变而改变
 * @Description:
 * @date 2020-02-16 12:08
 */
public class StrategyMain {


    /**
     *   策略模式: 类(角色)的行为(攻击) 随着策略(武器) 变化而变化
     * @param args
     */
    public static void main(String[] args) {
        Weapon swordWeapon= new SwordWeapon();
        Weapon knifeWeapon = new KnifeWeapon();
        Role kingRole = new King(swordWeapon);
        Role queenRole = new Queen(knifeWeapon);
        System.out.println("召唤师就位======,拿着宝剑的国王和拿着短刀的王后登场 ");
        System.out.print("国王使用宝剑开始攻击 ");
        kingRole.fight();
        System.out.print("王后使用短刀开始攻击 ");
        queenRole.fight();

        System.out.println();
        System.out.println("国王开始切换武器。。。 切换成短刀");
        System.out.print("国王切换成短刀开始攻击 ");
        kingRole.setWeapon(knifeWeapon);
        kingRole.fight();
    }
}
