package com.xuningchuan.demo.designpatterns.strategy;

/**
 * @author xuningchuan
 * @Title: Role  角色几类
 * @Description:
 * @date 2020-02-16 12:10
 */
public abstract class Role {

   public Weapon weapon;

   public Role(Weapon weapon){
       this.weapon = weapon;
   }
   public void fight(){
       this.weapon.useWeapon();
   }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
