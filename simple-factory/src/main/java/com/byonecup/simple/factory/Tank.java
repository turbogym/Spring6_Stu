package com.byonecup.simple.factory;

/**
 * @Title Spring6_Stu Tank
 * @Description 具体产品角色
 * @Author Turbo
 * @Date 2022/11/19 00:26
 * @Version 1.0
 */
public class Tank extends Weapon {
    @Override
    public void attack() {
        System.out.println("坦克开炮!");
    }
}
